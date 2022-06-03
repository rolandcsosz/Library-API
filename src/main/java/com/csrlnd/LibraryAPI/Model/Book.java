package com.csrlnd.LibraryAPI.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "books")
public class Book implements Serializable{
	
	@Id
	private String id;
	
	private String name;
	private String author;
	private int pageNumber;
	private boolean isAvailable;
	private LocalDate lastIssueDate;
	private String libraryId;
	
	
	public Book(String name, String author, int pageNumber, boolean isAvailable, LocalDate lastIssueDate,String libraryId) {
		this.name = name;
		this.author = author;
		this.pageNumber = pageNumber;
		this.isAvailable = isAvailable;
		this.lastIssueDate = lastIssueDate;
		this.libraryId = libraryId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public LocalDate getLastIssueDate() {
		return lastIssueDate;
	}


	public void setLastIssueDate(LocalDate lastIssueDate) {
		this.lastIssueDate = lastIssueDate;
	}


	public String getLibraryId() {
		return libraryId;
	}


	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	
	
	






	
}
