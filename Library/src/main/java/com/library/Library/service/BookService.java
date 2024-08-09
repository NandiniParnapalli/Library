package com.library.Library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.library.Library.beans.Book;
@Service
public class BookService {
public List<Book> books=new ArrayList<Book>();
public Book insert(Book b)
{
	books.add(b);
	return b;
}
public List<Book> getAll(){
	return books;
}
public Book getById(Integer id)
{
	for(Book b:books)
	{
		if(b.getId()==id)
		{
			return b;
		}
	}
	return null;
}
public Book getByTitle(String title)
{
	for(Book b:books)
	{
		if(b.getTitle()==title)
		{
			return b;
		}
	}
	return null;
}
public void deleteById(Integer id)
{
	for(Book b:books)
	{
		if(b.getId()==id)
		{
			books.remove(id);
		}
	}
}
}

