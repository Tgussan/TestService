package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, String> {

//	Optional<User> findById(String id);
//	
//	User save(User user);
}
