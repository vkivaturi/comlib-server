package com.comlib.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comlib.server.entity.Book;
import com.comlib.server.entity.Community;
import com.comlib.server.entity.User;
import com.comlib.server.service.BookService;
import com.comlib.server.service.CommunityService;
import com.comlib.server.service.UserService;

@RestController
public class Controller {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	BookService bookService;

	@Autowired
	CommunityService communityService;

	@Autowired
	UserService userService;

	@GetMapping("/book/add")
	public ResponseEntity<List<Book>> addBook() {
		System.out.println("Inside get2");
		bookService.addBookToGlobalCatalogue();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/community/add")
	public ResponseEntity<List<Community>> addCommunity() {
		System.out.println("Inside get2");
		communityService.addNewCommunity();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/user/add")
	public ResponseEntity<List<User>> addUser() {
		System.out.println("Inside get2");
		userService.addUser();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/user/addaccess")
	public ResponseEntity<List<User>> addUserAccess() {
		System.out.println("Inside get3");
		userService.addUserAccess();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/user/addbook")
	public ResponseEntity<List<User>> addUserBook() {
		System.out.println("Inside get4");
		userService.addUserBook();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}
