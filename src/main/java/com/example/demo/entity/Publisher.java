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
public class Publisher {
	@Id
	@GeneratedValue
    private Integer id;
	@Column(nullable = false)
    private String name;
    private String address;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob_date;
    @Column(name = "doe")
    @Temporal(TemporalType.DATE)
    private Date doe_date;
}
