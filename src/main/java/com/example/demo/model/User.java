package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	private String description;
	
	private Long createTime;
	
	private RoleType role;

}
