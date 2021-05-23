package com.comlib.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.comlib.server.dao.BookDao;
import com.comlib.server.entity.Book;

@Service
public class BookService {

	@Autowired
	JdbcTemplate jdbcTemplate;


	@Autowired
	BookDao bookDao;

	public BookService() {
		super();
		log.info("Creating tables");

	}

	private static final Logger log = LoggerFactory.getLogger(BookService.class);

	public void addBookToGlobalCatalogue() {
		System.out.println("Inside fetchAllBooks");
		Book book = new Book("Book title 1", "author 1", "link 1", "descfription 1", "isbn 1", 200, "English", "5 - 10 yrs", "link 2", "link3 ", "Penguin Co", 50, 150);
		bookDao.add(book);
	}

}
