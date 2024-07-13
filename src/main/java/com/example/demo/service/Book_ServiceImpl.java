package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.Book_IRepo;
@Service
public class Book_ServiceImpl implements Book_Iservice {
    
	@Autowired 
    Book_IRepo book_IRepo; 
	@Override
	public List<Book> getAllBook() {
		
		return book_IRepo.findAll(); 
	}

	@Override
	public List<Book> getBooksByAuthId(Integer aid) {
		
		return book_IRepo.findByAuthorId(aid);
	}

	@Override
	public Book getBook(Integer id) {
		Optional<Book> o = book_IRepo.findById(id);
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}

}
