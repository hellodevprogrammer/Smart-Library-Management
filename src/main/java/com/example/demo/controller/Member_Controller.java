package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.service.Member_Iservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Member_Controller {

	@Autowired
	private Member_Iservice member_Iservice;
	
	
	//GET ALL MEMBER
	@GetMapping("/members")
	public List<Member> getAllMembers()
	{
		return member_Iservice.getAllMember();
	}
	
	//GET MEMBER BY ID
	@GetMapping("/member/{id}")
	public Member getMemberId(@PathVariable("id")Integer id)
	{
		return member_Iservice.getMemberById(id);
	}
	
	//GET MEMBER BY NAME
	@GetMapping("/members/{name}")
	public List<Member> getMemberByName(@PathVariable("name") String name){
		return member_Iservice.getMemberByName(name);
		
	}
	
	//UPDATE A MEMBER
	@PostMapping("/member")
	public Member updateMember(@RequestBody Member member) {
		
		return member_Iservice.updateMember(member);
	}
	
	//ADD A NEW MEMBER
	@PutMapping("/member")
	public Member addMember(@RequestBody Member member )
	{
		return member_Iservice.createMember(member);
	}
	//DELETE SPECIFIC MEMBER USING ID
	@DeleteMapping("/member/{id}")
	public void deleteMember(@PathVariable("id")Integer id)
	{
		member_Iservice.deleteMemberById(id);
	}
	
	//DELETE ALL MEMBER 
	@DeleteMapping("/members")
	public void deleteAll() {
		member_Iservice.deleteAllMember();
	}
	
}
