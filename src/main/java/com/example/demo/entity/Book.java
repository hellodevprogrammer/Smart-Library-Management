package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	private Integer authorId;
	private Integer year;

	@Column(name = "insert_date")
	@Temporal(TemporalType.DATE)
	private Date in_date;
	@Column(name = "update_date")
	@Temporal(TemporalType.DATE)
	private Date up_date;
}
