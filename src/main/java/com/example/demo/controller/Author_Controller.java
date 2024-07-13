package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.service.Author_Iservice;

@RestController
public class Author_Controller {
	@Autowired
	Author_Iservice author_Iservice;
	@GetMapping(value="/getall/author")
  public List<Author> getAll(){
	  return author_Iservice.getAllAuthor();
  }
	@GetMapping(value="/get/author/{id}")
	  public Author getAll(@PathVariable("id") Integer id ){
		  return author_Iservice.getAuthById(id);
	  }
	@GetMapping(value="/getName/author/{name}")
    public List<Author> getAllAuthByName(@PathVariable("name") String name) {
		
		return author_Iservice.getAuthorByName(name);
	}
	
	@PostMapping(value = "/auth")			//create
	Author saveAuthor(@RequestBody Author author){
		return author_Iservice.saveAuthor(author);
	}
	@PutMapping(value = "/auth")			//create
	Author updateAuthor(@RequestBody Author author){
		return author_Iservice.saveAuthor(author);
	}
}
