package com.ngov.test.ws;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ngov.test.kafka.TwitterConsumer;
import com.ngov.test.model.Twitter;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RestController
public class TwitterRestServiceImpl {
	
	@Autowired
	private TwitterConsumer twitterConsumer;
	
	@CrossOrigin(origins = "http://135.254.163.44:4200")
	@RequestMapping(value="/twitters", method=RequestMethod.GET)
	public ResponseEntity<List<Twitter>> twitters() throws IOException {
		List<Twitter> twitters = twitterConsumer.consume();
		return new ResponseEntity<List<Twitter>>(twitters, HttpStatus.OK);
	}

}
