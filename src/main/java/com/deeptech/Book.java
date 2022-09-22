package com.deeptech;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookdetails")
public class Book {

	private Integer bookid;
	private String title;
	private String author;
	private float price;
	
	@Id
	@Column(name="bookid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBookid() {
		return bookid;
	}
	
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	@Column(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(name="price")
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
