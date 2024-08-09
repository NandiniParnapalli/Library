package com.library.Library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.library.Library.beans.Book;
import com.library.Library.beans.User;
@Service
public class UserService {
public List<User>users=new ArrayList<User>();
public User insertUser(User u)
{
	users.add(u);
	return u;
}
public List<User> getAll(){
	return users;
}
public User getByName(String name)
{
	for(User u:users)
	{
		if(u.getName()==name)
		{
			return u;
		}
	}
	return null;
}
public String deleteById(Integer id)
{
	for(User u:users)
	{
		if(u.getId()==id)
		{
			users.remove(id);
		}
	}
	return "user deleted";
}
}
