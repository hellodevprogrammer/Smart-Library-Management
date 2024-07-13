package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Publisher;
import com.example.demo.repository.Publisher_IRepo;
@Service
public class Publisher_ServiceImpl implements Publisher_Iservice{

	 @Autowired
	 Publisher_IRepo publisher_IRepo;
	@Override
	public Publisher getPubById(Integer id) {
		Optional<Publisher> o =  publisher_IRepo.findById(id);
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}

	@Override
	public List<Publisher> getPublisherByName(String name) {
		return publisher_IRepo.findByName(name);
		
	}

	@Override
	public List<Publisher> getAllPublisher() {
		
		return publisher_IRepo.findAll();
	}
  
}
