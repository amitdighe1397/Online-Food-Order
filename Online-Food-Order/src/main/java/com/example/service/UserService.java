package com.example.service;

import java.util.List;

import com.example.entities.User;
import com.example.payloads.UserPayloads;

public interface UserService {
	
	public UserPayloads saveUser(UserPayloads userPayloads);
	
	public List<UserPayloads> getAllusers();
	
	public UserPayloads getById(int id);
	
	public UserPayloads UpdateUser(UserPayloads userPayloads, int id);
	
	public void deleteUserById(int id);
	

}
