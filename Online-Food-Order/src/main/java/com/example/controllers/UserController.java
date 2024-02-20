package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payloads.UserPayloads;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/User-api")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public ResponseEntity<UserPayloads> saveUser(@RequestBody UserPayloads userPayloads) {

		UserPayloads userPayloads2 = this.userService.saveUser(userPayloads);

		return new ResponseEntity<UserPayloads>(userPayloads2, HttpStatus.CREATED);

	}

	@GetMapping("/getalluser")
	public ResponseEntity<List<UserPayloads>> getAllusers() {

		List<UserPayloads> user = this.userService.getAllusers();

		return new ResponseEntity<List<UserPayloads>>(user, HttpStatus.ACCEPTED);

	}

	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<UserPayloads> getById(@PathVariable int id) {

		UserPayloads userPayloads = this.userService.getById(id);

		return new ResponseEntity<UserPayloads>(userPayloads, HttpStatus.ACCEPTED);

	}

	@PutMapping("/updateuser/{id}")
	public ResponseEntity<UserPayloads> putMethodName(@PathVariable int id, @RequestBody UserPayloads userPayloads) {

		UserPayloads userPayloads2 = this.userService.UpdateUser(userPayloads, id);

		return new ResponseEntity<UserPayloads>(userPayloads2, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUserById(@PathVariable int id) {

		this.userService.deleteUserById(id);

		return "Data is Deleted...!";

	}

}
