package com.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.login.model.BaseResponse;
import com.user.login.model.CreateUserRequest;
import com.user.login.service.UserService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<BaseResponse> registerUser(@RequestBody CreateUserRequest createUserRequest) {
		userService.registerUser(createUserRequest);
		return ResponseEntity.ok(BaseResponse.getInstance());
	}
}
