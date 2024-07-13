package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Author;

public interface Author_Iservice {
     Author getAuthById(Integer id);
     List<Author> getAuthorByName(String name);
     List<Author> getAllAuthor();
     Author saveAuthor( Author author);
}
