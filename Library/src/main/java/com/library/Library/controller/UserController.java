package com.library.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.Library.beans.User;
import com.library.Library.service.UserService;
@RestController
public class UserController
{
@Autowired
UserService user;
@PostMapping("/create")
public User insert(@RequestBody  User u)
{
	return user.insertUser(u);
} 
@GetMapping("/get")
public List<User> getAll(){
	return user.getAll();
}
@GetMapping("/name")
public User getByName(@RequestParam String name)
{
	return user.getByName(name);
}
@DeleteMapping("/delete")
public String delete(@RequestParam int id){
	 user.deleteById(id);
	 return "user deleted";
}
}
