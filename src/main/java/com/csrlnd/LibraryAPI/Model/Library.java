package com.csrlnd.LibraryAPI.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Document(collection = "libraries")
public class Library implements Serializable{
	
	@Id
	private String id;
	
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private int fee;
	@JsonIgnore
	static public List<Book> books;
	@JsonIgnore
	static public List<LibraryMember> members;
	
	
	public Library(String name, String phoneNumber, String emailAddress, int fee) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.fee = fee;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public static List<Book> getBooks() {
		return books;
	}
	public static void setBooks(List<Book> books) {
		Library.books = books;
	}
	public static List<LibraryMember> getMembers() {
		return members;
	}
	public static void setMembers(List<LibraryMember> members) {
		Library.members = members;
	}

	
	
}
