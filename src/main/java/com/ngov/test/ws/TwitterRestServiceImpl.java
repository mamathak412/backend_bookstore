package com.ngov.test.ws;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngov.test.model.Twitter;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RestController
public class TwitterRestServiceImpl {

	private static final Logger logger = LoggerFactory.getLogger(TwitterRestServiceImpl.class);

	private final KafkaTemplate<String, Object> template;
	private final String topicName = "twitter";
	private final int messagesPerRequest = 10;
	private CountDownLatch latch;

	public TwitterRestServiceImpl(final KafkaTemplate<String, Object> template) {
		this.template = template;
	}

	@GetMapping("/twitters")
	public String twitters() throws Exception {
		latch = new CountDownLatch(messagesPerRequest);
		IntStream.range(0, messagesPerRequest)
				.forEach(i -> this.template.send(topicName, String.valueOf(i), new Twitter()));
		latch.await(60, TimeUnit.SECONDS);
		logger.info("All messages received");
		return "Hello Kafka!";
	}

	@KafkaListener(topics = "twitter", containerFactory = "kafkaListenerContainerFactory")
	public void listenAsObject(ConsumerRecord<String, Twitter> cr, @Payload Twitter payload) {
		logger.info("Logger 1 [JSON] received key {}: Type [{}] | Payload: {} | Record: {}", cr.key(),
				typeIdHeader(cr.headers()), payload, cr.toString());
		latch.countDown();
	}

	@KafkaListener(topics = "twitter", containerFactory = "kafkaListenerStringContainerFactory")
	public void listenasString(ConsumerRecord<String, String> cr, @Payload String payload) {
		logger.info("Logger 2 [String] received key {}: Type [{}] | Payload: {} | Record: {}", cr.key(),
				typeIdHeader(cr.headers()), payload, cr.toString());
		latch.countDown();
	}

	@KafkaListener(topics = "twitter", containerFactory = "kafkaListenerByteArrayContainerFactory")
	public void listenAsByteArray(ConsumerRecord<String, byte[]> cr, @Payload byte[] payload) {
		logger.info("Logger 3 [ByteArray] received key {}: Type [{}] | Payload: {} | Record: {}", cr.key(),
				typeIdHeader(cr.headers()), payload, cr.toString());
		latch.countDown();
	}

	private static String typeIdHeader(Headers headers) {
		return StreamSupport.stream(headers.spliterator(), false).filter(header -> header.key().equals("__TypeId__"))
				.findFirst().map(header -> new String(header.value())).orElse("N/A");
	}

}
