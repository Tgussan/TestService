package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LongDTO;
import com.example.demo.model.User;
import com.example.demo.model.UserDTO;
import com.example.demo.model.UserDetailDTO;
import com.example.demo.model.UserDetailDTO2;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDTO getUser(String id) {
		Optional<User> user = userRepository.findById(id);
		UserDTO dto = new UserDTO();
		user.ifPresent(value -> {
			BeanUtils.copyProperties(value, dto);
	    });
		return dto;
	}
	
	public void saveUser(UserDTO dto) {
		User user = new User();
		BeanUtils.copyProperties(dto, user);
		userRepository.save(user);
	}
	
	public void saveObject(Object target) {
		if(target instanceof UserDetailDTO) {
			UserDetailDTO dto = (UserDetailDTO)target;
			System.out.println(dto);
			
		}
		
		if(target instanceof UserDetailDTO2) {
			UserDetailDTO2 dto = (UserDetailDTO2)target;
			System.out.println(dto);
			
		}
		
		
		if(target instanceof LongDTO) {
			LongDTO dto = (LongDTO)target;
			System.out.println(dto);
			
		}
		
		if(target instanceof UserDTO) {
			UserDTO dto = (UserDTO)target;
			System.out.println(dto);
		}
	}
}
