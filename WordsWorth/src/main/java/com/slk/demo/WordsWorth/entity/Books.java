package com.slk.demo.WordsWorth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	
	@Id
	@Column(name="book_id")
	private int bookId;
	@Column(name="supplier_id")
	private int supplierId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="author")
	private String authorName;
	@Column(name="price")
	private double price;
	@Column(name="category")
	private String category;
	@Column(name="book_quantity")
	private int bookQuantity;
	@Column(name="book_availability")
	private boolean bookAvailabilty;
	
	
	public Books() {
		
	}
	

}
