package com.comlib.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Book entity stores basic details of a book. This is a master catalogue of all books in the application.
//Users are allowed to select books from the master catalogue or add new books to the master catalogue

@Entity
public class Book {
	private @Id @GeneratedValue Long bookId;
	private String title;
	private String author;
	private String isbn;
	private String imageUrl;
	private int pages;
	private String language;
	private String readingAgeGroup;
	private String amazonLink;
	private String flipkartLink;
	private String publisher;
	private int totalRatingsCount;
	private long totalRatingStars;
	
	//Default constructor
	public Book() {
		super();
	}

	//Constructor with all fields provided by client
	public Book(Long bookId, String title, String author, String isbn, String imageUrl, int pages, String language,
			String readingAgeGroup, String amazonLink, String flipkartLink, String publisher, int totalRatingsCount,
			long totalRatingStars) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.imageUrl = imageUrl;
		this.pages = pages;
		this.language = language;
		this.readingAgeGroup = readingAgeGroup;
		this.amazonLink = amazonLink;
		this.flipkartLink = flipkartLink;
		this.publisher = publisher;
		this.totalRatingsCount = totalRatingsCount;
		this.totalRatingStars = totalRatingStars;
	}
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
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
	public void setTotalRatingStars(long totalRatingStars) {
		this.totalRatingStars = totalRatingStars;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", imageUrl="
				+ imageUrl + ", pages=" + pages + ", language=" + language + ", readingAgeGroup=" + readingAgeGroup
				+ ", amazonLink=" + amazonLink + ", flipkartLink=" + flipkartLink + ", publisher=" + publisher
				+ ", totalRatingsCount=" + totalRatingsCount + ", totalRatingStars=" + totalRatingStars + "]";
	}

}
