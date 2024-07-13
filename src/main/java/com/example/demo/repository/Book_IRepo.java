package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;


public interface Book_IRepo extends JpaRepository<Book,Integer> {
	List<Book> findByAuthorId(Integer authID);
	
}
