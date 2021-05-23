package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comlib.server.entity.User;
import com.comlib.server.entity.UserAccess;
import com.comlib.server.entity.UserBook;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public UserDao() {
		super();
	}

	public void add(User user) {

		MapSqlParameterSource mapSqlBook = new MapSqlParameterSource();
		mapSqlBook.addValue("email", user.getEmail());
		mapSqlBook.addValue("name", user.getName());
		mapSqlBook.addValue("password", user.getPassword());
		mapSqlBook.addValue("isActive", user.isActive());

		String insertSql = "insert into user (email, name, password, isActive) values (:email, :name, :password, :isActive);";

		namedParameterJdbcTemplate.update(insertSql, mapSqlBook);

	}

	public void addAccess(UserAccess useraccess) {

		MapSqlParameterSource mapSqlBook = new MapSqlParameterSource();
		mapSqlBook.addValue("userId", useraccess.getUserId());
		mapSqlBook.addValue("communityId", useraccess.getCommunityId());
		mapSqlBook.addValue("isActive", useraccess.isActive());
		mapSqlBook.addValue("accessStartDate", useraccess.getAccessStartDate());
		mapSqlBook.addValue("accessEndDate", useraccess.getAccessEndDate());
		mapSqlBook.addValue("accessProviderUserId", useraccess.getAccessProviderUserId());

		String insertSql = "insert into useraccess (userId, communityId, isActive, accessStartDate, accessEndDate, accessProviderUserId) values (:userId, :communityId, :isActive, :accessStartDate, :accessEndDate, :accessProviderUserId);";

		namedParameterJdbcTemplate.update(insertSql, mapSqlBook);

	}

	public void addUserBook(UserBook userbook) {

		MapSqlParameterSource mapSqlBook = new MapSqlParameterSource();
		mapSqlBook.addValue("userId", userbook.getUserId());
		mapSqlBook.addValue("communityId", userbook.getCommunityId());
		mapSqlBook.addValue("bookId", userbook.getBookId());
		mapSqlBook.addValue("isActive", userbook.isActive());
		mapSqlBook.addValue("isAvailable", userbook.isAvailable());
		mapSqlBook.addValue("lendStartDate", userbook.getLendStartDate());		
		mapSqlBook.addValue("lendeeUserId", userbook.getLendeeUserId());

		String insertSql = "insert into userbook (userId, communityId, bookId, isActive, isAvailable, lendStartDate, lendeeUserId) values (:userId, :communityId, :bookId, :isActive, :isAvailable, :lendStartDate, :lendeeUserId);";

		namedParameterJdbcTemplate.update(insertSql, mapSqlBook);

	}

}
