package com.example.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.payloads.UserPayload;
import com.example.repositry.UserRepository;
import com.example.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<UserPayload> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().map(user -> modelMapper.map(user, UserPayload.class))
				.collect(Collectors.toList());
	}

	public UserPayload getUserById(int userId) {
		User user = userRepository.findById(userId).orElse(null);
		if (user != null) {
			return modelMapper.map(user, UserPayload.class);
		}
		return null;
	}

	public UserPayload createUser(UserPayload userPayload) {
		User user = modelMapper.map(userPayload, User.class);
		User savedUser = userRepository.save(user);
		return modelMapper.map(savedUser, UserPayload.class);
	}

	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}
}
