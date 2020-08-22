package com.cts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.User;
import com.cts.repo.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/addusers")
	public List<User> addUsers(@RequestBody List<User> user){
		 logger.info("Post method executed");
		return repository.saveAll(user);	
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		logger.info("Post method executed");
		return repository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getAll()
	{
		logger.info("Get method executed");
		return repository.findAll();
		
	}
	
	public User getById(@PathVariable int id)
	{
		logger.info("Get method executed");
		return repository.findById(id).get();
		
	}
	

}
