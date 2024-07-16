package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Author;
import com.example.demo.entity.Member;

public interface Member_IRepo extends JpaRepository<Member, Integer>{

	List<Member> findByName(String name);
}
