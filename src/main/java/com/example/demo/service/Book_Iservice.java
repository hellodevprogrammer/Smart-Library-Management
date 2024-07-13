package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface Book_Iservice {
    List<Book> getAllBook();
    List<Book> getBooksByAuthId(Integer aid);
    Book getBook(Integer id);
}
