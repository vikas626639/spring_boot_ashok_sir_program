package com.nit.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity	
public class Contect_master {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer contect_id;
	private String contect_name;
	private long contect_number;
	//getter and setter method
}
