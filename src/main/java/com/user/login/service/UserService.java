package com.user.login.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.login.entity.User;
import com.user.login.model.CreateUserRequest;
import com.user.login.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public void registerUser(CreateUserRequest createUserRequest) {
		User user = modelMapper.map(createUserRequest, User.class);
		userRepository.save(user);
	}
}
