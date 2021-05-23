package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comlib.server.entity.Community;

@Repository
public class CommunityDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public CommunityDao() {
		super();
	}

	public void add(Community community) {

		MapSqlParameterSource mapSqlBook = new MapSqlParameterSource();
		mapSqlBook.addValue("name", community.getName());
		mapSqlBook.addValue("locality", community.getLocality());
		mapSqlBook.addValue("city", community.getCity());
		mapSqlBook.addValue("pinCode", community.getPinCode());
		mapSqlBook.addValue("adminUser", community.getAdminUser());

		String insertSql = "insert into community (name, locality, city, pinCode, adminUser) values (:name, :locality, :city, :pinCode, :adminUser);";

		namedParameterJdbcTemplate.update(insertSql, mapSqlBook);

	}

}
