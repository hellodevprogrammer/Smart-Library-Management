package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Member;
import com.example.demo.repository.Member_IRepo;

public interface Member_Iservice {

	public List<Member> getAllMember();
	public Member getMemberById(Integer id);
	public Member createMember(Member member);
	public Member updateMember(Member member);
	public void deleteMemberById(Integer id);
	public List<Member> getMemberByName(String name);
	public void deleteAllMember();
}
