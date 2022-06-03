package com.csrlnd.LibraryAPI.Model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**K�nyvt�rba regisztr�lt di�kok reprezent�l�s�ra haszn�lt oszt�ly.
 * @author Roland
 *
 */
@Document(collection = "members")
public class Student extends LibraryMember{
	
	
	private String neptunCode;
	
	private List<Book> books;
	
	public Student(String name, String emailAddress, String libraryId, String neptunCode, List<Book> books) {
		super(name, emailAddress, libraryId);
		this.neptunCode = neptunCode;
		this.books = books;
	}

	public String getNeptunCode() {
		return neptunCode;
	}

	public void setNeptunCode(String neptunCode) {
		this.neptunCode = neptunCode;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


	
	
	
	
	
}
