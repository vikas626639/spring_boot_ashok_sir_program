package com.nit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity	
@Table(name = "Contect_master")
public class ContectmasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contect_id")
	private Integer contectid;
	@Column(name = "Contect_name")
	private String contectName;
	@Column(name="contect_number")
	private long contectNumber;
	//getter and setter method
}
