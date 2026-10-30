package com.vcube.teamexpensemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.teamexpensemanager.dto.UserRequest;
import com.vcube.teamexpensemanager.entity.User;
import com.vcube.teamexpensemanager.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	UserService userservice;
	
	@PostMapping("/createUser")
	ResponseEntity<User> createrUser(@RequestBody @Valid UserRequest user) {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(userservice.createUser(user));
	}
	@GetMapping("/getUsersList")
	List<User>findUsers(){
		return userservice.getAllUsers();
	}
	@GetMapping("/getUser/{id}")
	User findUser(@PathVariable Long id) {
		return userservice.getUserById(id);
	}
	@DeleteMapping("/deleteUser/{id}")
	void deleteUser(@PathVariable Long id) {
		userservice.deleteUser(id);
	}
}
