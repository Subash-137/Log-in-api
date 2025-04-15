package com.user.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);

}
