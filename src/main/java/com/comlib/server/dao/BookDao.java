package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comlib.server.entity.Book;

@Repository
public class BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public BookDao() {
		super();
	}

	public void add(Book book) {

		MapSqlParameterSource mapSqlBook = new MapSqlParameterSource();
		mapSqlBook.addValue("title", book.getTitle());
		mapSqlBook.addValue("author", book.getAuthor());
		mapSqlBook.addValue("imageUrl", book.getImageUrl());
		mapSqlBook.addValue("description", book.getDescription());
		mapSqlBook.addValue("isbn", book.getIsbn());
		mapSqlBook.addValue("pages", book.getPages());
		mapSqlBook.addValue("language", book.getLanguage());
		mapSqlBook.addValue("readingAgeGroup", book.getReadingAgeGroup());
		mapSqlBook.addValue("amazonUrl", book.getAmazonLink());
		mapSqlBook.addValue("flipkartUrl", book.getFlipkartLink());
		mapSqlBook.addValue("publisher", book.getPublisher());
		mapSqlBook.addValue("totalRatingsCount", book.getTotalRatingsCount());
		mapSqlBook.addValue("totalRatingsValue", book.getTotalRatingStars());

		String insertSql = "insert into book (title, author, imageUrl, description, isbn, pages, language, readingAgeGroup, amazonUrl, flipkartUrl, publisher, totalRatingsCount, totalRatingsValue) values (:title, :author, :imageUrl, :description, :isbn, :pages, :language, :readingAgeGroup, :amazonUrl, :flipkartUrl, :publisher, :totalRatingsCount, :totalRatingsValue);";

		namedParameterJdbcTemplate.update(insertSql, mapSqlBook);

	}

}
