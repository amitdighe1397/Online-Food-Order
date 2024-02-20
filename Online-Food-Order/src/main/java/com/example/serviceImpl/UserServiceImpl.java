package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.payloads.UserPayloads;
import com.example.repositry.UserRepositry;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositry userRepositry;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserPayloads saveUser(UserPayloads userPayloads) {

		User user = this.modelMapper.map(userPayloads, User.class);

		User user2 = this.userRepositry.save(user);

		UserPayloads userPayloads2 = this.modelMapper.map(user2, UserPayloads.class);

		return userPayloads2;
	}

	@Override
	public List<UserPayloads> getAllusers() {
	    List<User> userList = this.userRepositry.findAll();
	    List<UserPayloads> userPayloads = new ArrayList<>();

	    for (User user : userList) {
	        UserPayloads userPayload = this.modelMapper.map(user, UserPayloads.class);
	        userPayloads.add(userPayload);
	    }

	    return userPayloads;
	}
	
	
	
	
	
	
	
	@Override
	public UserPayloads getById(int id) {

		User user = this.userRepositry.findById(id).get();
		UserPayloads userPayloads = this.modelMapper.map(user, UserPayloads.class);
		return userPayloads;
	}

	@Override
	public UserPayloads UpdateUser(UserPayloads userPayloads, int id) {
		User user = this.userRepositry.findById(id).get();
		user.setUsername(userPayloads.getUsername());
		user.setPhone_Number(userPayloads.getPhone_Number());
		user.setAddress(userPayloads.getAddress());
		user.setEmail(userPayloads.getEmail());
		user.setPassword(userPayloads.getPassword());

		User user2 = this.userRepositry.save(user);
		UserPayloads userPayloads2 = this.modelMapper.map(user2, UserPayloads.class);
		return userPayloads2;
	}

	@Override
	public void deleteUserById(int id) {

		this.userRepositry.deleteById(id);

	}

}
