package com.bmw.progress.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.entity.Customer;
import com.bmw.entity.Result;
import com.bmw.progress.service.ProgressService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@RestController
@RequestMapping("/progress")
public class ProgressController {
	
	@Autowired
    private ProgressService progressService;
	
	@GetMapping("/test")
	public String test() throws JsonProcessingException {
		log.info("test.");
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = new HashMap<>();
        map.put("success", "OK");
		return objectMapper.writeValueAsString(map);
	}
	
	@GetMapping("/test/{id}")
    public Result testId(@PathVariable("id") String id) {
        return new Result().success(progressService.test(id));
    }
	
	@GetMapping("/ping")
    public Result testPing() {
        return new Result().success(progressService.testPing());
    }
	
	@GetMapping("/customer")
    public Result fetchCustomers() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		InputStream is = ProgressController.class.getResourceAsStream("/customer.json");
        Customer customer = objectMapper.readValue(is, Customer.class);
        return new Result().success(customer);
    }
	
	
}
