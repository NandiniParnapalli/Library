package com.library.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.Library.beans.Book;
import com.library.Library.beans.User;
import com.library.Library.service.BookService;
import com.library.Library.service.UserService;

@RestController
//@RequestMapping("/api/user")
public class BookController {
@Autowired
BookService ser;
@PostMapping("/book/insert")
public Book insert(@RequestBody  Book b)
{
	return ser.insert(b);
}
@GetMapping("/book/get")
public List<Book> getAll(){
	return ser.getAll();
}
@GetMapping("/book/id")
public Book getById(@RequestParam int id)
{
	return ser.getById(id);
}
@DeleteMapping("/book/delete")
public String delete(@RequestParam int id){
	 ser.deleteById(id);
	 return "book deleted";
}
}
