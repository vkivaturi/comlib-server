package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
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

		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(book);

		String insertSql = "insert into book (title, author, imageUrl, description, isbn, pages, language, readingAgeGroup, amazonUrl, flipkartUrl, publisher, totalRatingsCount, totalRatingsValue) values (:title, :author, :imageUrl, :description, :isbn, :pages, :language, :readingAgeGroup, :amazonUrl, :flipkartUrl, :publisher, :totalRatingsCount, :totalRatingsValue);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

}
