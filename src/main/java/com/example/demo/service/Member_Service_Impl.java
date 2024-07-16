package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.Member_IRepo;

@Service
public class Member_Service_Impl implements Member_Iservice {

	@Autowired
	private Member_IRepo member_IRepo;

	// GET ALL MEMBER
	@Override
	public List<Member> getAllMember() {
		return member_IRepo.findAll();
	}

	// GET MEMBER BY ID
	@Override
	public Member getMemberById(Integer id) {
		// Optional<Member> optional=member_IRepo.findById(id);

		return member_IRepo.findById(id).get();
	}
	// GET MEMBER BY NAME
	@Override
	public List<Member> getMemberByName(String name) {
		// TODO Auto-generated method stub
		
		return member_IRepo.findByName(name);
	}

	// SAVE USER !! CREATE USER
	@Override
	public Member createMember(Member member) {
		return member_IRepo.save(member);
	}

	// UPDATE USER
	@Override
	public Member updateMember(Member member) {
		return member_IRepo.save(member);
	}

	// DELETE MEMBER BY ID
	@Override
	public void deleteMemberById(Integer id) {
		member_IRepo.deleteById(id);
	}

	@Override
	public void deleteAllMember() {
		 member_IRepo.deleteAll();
	}

	


}
