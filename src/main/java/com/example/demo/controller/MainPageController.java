package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LongDTO;
import com.example.demo.model.User;
import com.example.demo.model.UserDTO;
import com.example.demo.model.UserDetailDTO;
import com.example.demo.model.UserDetailDTO2;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/")
public class MainPageController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String createMain() {
		User user = new User();
		user.setId("test");
		user.setName("testName");
		user.setEmail("email");
		user.setCreateTime((long) 0);
		
		UserDTO dto = new UserDTO();
		dto.setId("testId");
		dto.setEmail("testEmail");
		
		UserDetailDTO detail = new UserDetailDTO();
		detail.setId("detail");
		detail.setEmail("detailName");
		detail.setDescription("îıçl");
		
		UserDetailDTO2 detail2 = new UserDetailDTO2();
		detail2.setId("detail");
		detail2.setEmail("detailName");
		detail2.setDescription("îıçl");
		
		LongDTO longDTO = new LongDTO();
		longDTO.setCreateTime((long) 0);
		
		userService.saveObject(longDTO);
		//userService.saveUser(dto);
		return "DataCreate";
	}

	@GetMapping("/test")
	public String createTest() {
		UserDTO user = userService.getUser("testId");
		System.out.println(user);
		return "test";
	}
}
