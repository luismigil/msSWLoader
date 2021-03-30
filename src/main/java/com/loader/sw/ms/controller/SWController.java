package com.loader.sw.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.loader.sw.ms.message.ResponseMessage;
import com.loader.sw.ms.model.People;
import com.loader.sw.ms.service.SWService;

@Controller
@RequestMapping("/")
public class SWController {

	String message = "";
	@Autowired
	SWService swService;
	
	@PostMapping
	public ResponseEntity<ResponseMessage> importData(){
		try {
			swService.saveAll();
			message = "Data import success";
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}catch(Exception e) {
			message = "Data import error: " + e.getMessage();
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}
}
