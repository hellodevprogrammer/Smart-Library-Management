package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Publisher;

public interface Publisher_IRepo extends JpaRepository<Publisher,Integer> {
  List<Publisher> findByName(String name);
}
