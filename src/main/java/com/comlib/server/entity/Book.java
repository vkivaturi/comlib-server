package com.comlib.server.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Book entity stores basic details of a book. This is a master catalogue of all books in the application.
//Users are allowed to select books from the master catalogue or add new books to the master catalogue

public class Book {
	private Long id;
	private String title;
	private String author;
	private String isbn;
	private String imageUrl;
	private String description;
	private int pages;
	private String language;
	private String readingAgeGroup;
	private String amazonLink;
	private String flipkartLink;
	private String publisher;
	private int totalRatingsCount;
	private int totalRatingStars;
	
	//Default constructor
	public Book() {
		super();
	}

	//Constructor with all fields provided by client
	public Book(String title, String author, String isbn, String imageUrl, String description, int pages,
			String language, String readingAgeGroup, String amazonLink, String flipkartLink, String publisher,
			int totalRatingsCount, int totalRatingStars) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.imageUrl = imageUrl;
		this.description = description;
		this.pages = pages;
		this.language = language;
		this.readingAgeGroup = readingAgeGroup;
		this.amazonLink = amazonLink;
		this.flipkartLink = flipkartLink;
		this.publisher = publisher;
		this.totalRatingsCount = totalRatingsCount;
		this.totalRatingStars = totalRatingStars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getReadingAgeGroup() {
		return readingAgeGroup;
	}
	public void setReadingAgeGroup(String readingAgeGroup) {
		this.readingAgeGroup = readingAgeGroup;
	}
	public String getAmazonLink() {
		return amazonLink;
	}
	public void setAmazonLink(String amazonLink) {
		this.amazonLink = amazonLink;
	}
	public String getFlipkartLink() {
		return flipkartLink;
	}
	public void setFlipkartLink(String flipkartLink) {
		this.flipkartLink = flipkartLink;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getTotalRatingsCount() {
		return totalRatingsCount;
	}
	public void setTotalRatingsCount(int totalRatingsCount) {
		this.totalRatingsCount = totalRatingsCount;
	}
	public long getTotalRatingStars() {
		return totalRatingStars;
	}
	public void setTotalRatingStars(int totalRatingStars) {
		this.totalRatingStars = totalRatingStars;
	}
	
	  @Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Book))
	      return false;
	    Book book = (Book) o;
	    return Objects.equals(this.id, book.id) && Objects.equals(this.title, book.title);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.title);
	  }

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", imageUrl="
				+ imageUrl + ", description=" + description + ", pages=" + pages + ", language=" + language
				+ ", readingAgeGroup=" + readingAgeGroup + ", amazonLink=" + amazonLink + ", flipkartLink="
				+ flipkartLink + ", publisher=" + publisher + ", totalRatingsCount=" + totalRatingsCount
				+ ", totalRatingStars=" + totalRatingStars + "]";
	}
	  
}
