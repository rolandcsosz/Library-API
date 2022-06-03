package com.csrlnd.LibraryAPI.Model;

import java.io.Serializable ;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


public abstract class LibraryMember implements Serializable{
	
	protected String id;
	protected String name;
	protected String emailAddress;
	private String libraryId;
	
	public LibraryMember(String name, String emailAddress, String libraryId) {
		this.name = name;
		this.emailAddress = emailAddress;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	
	
	
	
	
}
