package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.repository.Author_IRepo;

@Service
public class Author_ServiceImpl implements Author_Iservice{
    @Autowired
	Author_IRepo author_IRepo;
    
	@Override
	public Author getAuthById(Integer id) {
		Optional<Author> o =  author_IRepo.findById(id);
		
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}

	@Override
	public List<Author> getAuthorByName(String name) {
		// TODO Auto-generated method stub
		List<Author> list = author_IRepo.findByName(name);
		return list;
	}

	@Override
	public List<Author> getAllAuthor() {
		List<Author> l = author_IRepo.findAll();
		return l;
	}

	@Override
	public Author saveAuthor(Author author) {
		Author a = author_IRepo.save(author);
		return a;
	}

}
