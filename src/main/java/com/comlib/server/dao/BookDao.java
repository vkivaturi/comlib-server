package com.comlib.server.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
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

	//Add book to database
	public void add(Book book) {

		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(book);

		String insertSql = "insert into book (title, author, imageUrl, description, isbn, pages, language, readingAgeGroup, amazonUrl, flipkartUrl, publisher, totalRatingsCount, totalRatingsValue) values (:title, :author, :imageUrl, :description, :isbn, :pages, :language, :readingAgeGroup, :amazonUrl, :flipkartUrl, :publisher, :totalRatingsCount, :totalRatingsValue);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

	//Search book based on input string matched against title and author. This supports pagination
	public List<Book> searchBookByTitleAuthor(String title, String author, String sortField, String sortType,
			int pageOffset, int pageSize) {

		String selectSql = "select id, title, author, imageUrl, description, isbn, pages, language, readingAgeGroup, amazonUrl, flipkartUrl, publisher, totalRatingsCount, totalRatingsValue from book where 1=1 ";

		// Check values for each input and add to the query string if it is not null
		selectSql = (title != null) ? (selectSql + " and (title LIKE \'%" + title + "%\'") : selectSql;
		selectSql = (author != null) ? (selectSql + " or author = \'%" + author + "%\')") : selectSql;

		//Apply sort and pagination
		selectSql = selectSql + " order by " + sortField + " " + sortType;
		selectSql = selectSql + " LIMIT " + pageOffset + ", " + pageSize;

		return namedParameterJdbcTemplate.query(selectSql, new BeanPropertyRowMapper<Book>(Book.class));

	}

}
