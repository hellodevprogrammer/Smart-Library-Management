package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.entity.Publisher;
import com.example.demo.service.Publisher_Iservice;

@RestController
public class Publisher_Controller {
	
	@Autowired
	Publisher_Iservice publisher_Iservice;
	@GetMapping(value="/getall/publisher")
    public List<Publisher> getAll() {
		
		return publisher_Iservice.getAllPublisher();
	}
	@GetMapping(value="/get/publisher/{id}")
    public Publisher getById(@PathVariable("id") Integer id) {
		
		return publisher_Iservice.getPubById(id);
	}
	@GetMapping(value="/getName/publisher/{name}")
    public List<Publisher> getAllPubByName(@PathVariable("name") String name) {
		
		return publisher_Iservice.getPublisherByName(name);
	}
}
