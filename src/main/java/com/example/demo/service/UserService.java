package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.facode.FacodeRouter;
import com.example.demo.model.User;
import com.example.demo.model.UserDTO;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	private FacodeRouter facodeRouter;
	
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
		facodeRouter.router(target);
	}
}
