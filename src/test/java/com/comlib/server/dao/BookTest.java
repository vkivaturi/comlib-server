package com.comlib.server.dao;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.comlib.server.ServerApplicationTests;
import com.comlib.server.entity.Book;

public class BookTest extends ServerApplicationTests {
//	@Autowired
//	private WebApplicationContext webApplicationContext;

	@Autowired
	BookDao bookDao;
	
	//private MockMvc mockMvc;
	
	@Before
	public void setup() {
		//mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void addBookTest() throws Exception {
		
		Book book = new Book("Book title 1", "author 1", "link 1", "descfription 1", "isbn 1", 200, "English", "5 - 10 yrs", "link 2", "link3 ", "Penguin Co", 50, 150);
		bookDao.add(book);
	
//		mockMvc.perform(get("/employee")).andExpect(status().isOk())
//				.andExpect(content().contentType("application/json;charset=UTF-8"))
//				.andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
//				.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

	}

	@Test
	public void searchBookByTitleAuthorTest() throws Exception {
		
		List<Book> books = bookDao.searchBookByTitleAuthor("title", "test author", "title", "asc", 0, 10);
		
		System.out.println(books.get(0).getAuthor());
	
	}

}
