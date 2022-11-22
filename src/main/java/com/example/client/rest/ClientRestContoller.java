package com.example.client.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.client.model.UserData;

@RestController
public class ClientRestContoller {
	

	Logger logger = LoggerFactory.getLogger(ClientRestContoller.class);
	
	@Value("${apiURL}")
	private String apiURL;

	@PostMapping(value = "/api", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<UserData> saveUser(@RequestBody UserData userData) throws Exception {
		logger.info("Welcome To Post Client");
		 
		ResponseEntity<UserData> postForEntity = null;
		try {
		RestTemplate rt = new RestTemplate();
			 postForEntity = rt.postForEntity(apiURL, userData, UserData.class);
		} catch (Exception e) {
			logger.error(" Error while getting the  " + e.getMessage());
		}
		return postForEntity;
	}
}
