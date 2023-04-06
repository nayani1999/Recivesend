package com.app.receivesend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ReceivesendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceivesendApplication.class, args);
	}
    
	@PostMapping("/receivemessage")
		    public ResponseEntity<String> receiveMessage(@RequestBody String message) {
		        System.out.println("Received message: " + message);
		        String response = "Message received successfully";
		        HttpHeaders headers = new HttpHeaders();
		        headers.setContentType(MediaType.APPLICATION_JSON);
		        return new ResponseEntity<>(response, headers, HttpStatus.OK);
		    }
		}

		
		
		


	
	
	
	

