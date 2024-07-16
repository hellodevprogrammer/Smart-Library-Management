package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;  
	@Column(nullable = false)
	private String name;
	private String email;
	private Integer password;
	//private String Role;
	@CreationTimestamp
	@Immutable
	private LocalDate entry_date;
	@CreationTimestamp
	private LocalDate modify_date;
}
