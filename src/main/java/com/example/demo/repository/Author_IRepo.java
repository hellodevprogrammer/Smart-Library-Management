package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Author;

public interface Author_IRepo extends JpaRepository<Author,Integer> {
//	 @Query("select * from Author  where name = name")
	List<Author> findByName(String name);
}
