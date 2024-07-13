package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.Book_Iservice;

@RestController
public class Book_Controller {
	@Autowired
	Book_Iservice book_Iservice;
	@GetMapping(value="/getall/books")
	public List<Book> getAllBooks(){
		return book_Iservice.getAllBook();
	}
	@GetMapping(value="/getallbyaid/books/{aid}")
	public List<Book> getAllBooks(@PathVariable("aid") Integer aid){
		return book_Iservice.getBooksByAuthId(aid);
	}
	@GetMapping(value="/getByid/books/{id}")
	public Book getById(@PathVariable("id") Integer id){
		return book_Iservice.getBook(id);
	}
}
