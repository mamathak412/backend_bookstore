package com.ngov.test.kafka;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.log4j.BasicConfigurator;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ngov.test.model.Twitter;

@Component
public class TwitterConsumer {
	
	@KafkaListener(topics = "twitter", group="twitter-group")
	public List<Twitter> consume() throws IOException {
		BasicConfigurator.configure();
		List<Twitter> twitters = new ArrayList<>();
		KafkaConsumer<String, String> consumer = createConsumer("twitter");
		  
			while (true) {
				ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100)); // new in Kafka 2.0.0
				for(ConsumerRecord<String, String> record: records) {
					Twitter twitter = new Twitter();
					twitter.setTwitterContent(record.value());
					twitters.add(twitter);
				}
				return twitters;
			}
		
	}

	public static KafkaConsumer<String, String> createConsumer(String topic) {

		String bootstrapServers = "135.254.163.44:9092";
		String groupId = "twitter-group";

		// create consumer configs
		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false"); // disable auto commit of offsets
		properties.setProperty(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "100000"); // disable auto commit of offsets

		// create consumer
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
		consumer.subscribe(Arrays.asList(topic));

		return consumer;

	}

}
