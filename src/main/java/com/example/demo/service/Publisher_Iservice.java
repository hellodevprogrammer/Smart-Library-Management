package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Publisher;

public interface Publisher_Iservice {
    Publisher getPubById(Integer id);
    List<Publisher> getPublisherByName(String name);
    List<Publisher> getAllPublisher();
}
