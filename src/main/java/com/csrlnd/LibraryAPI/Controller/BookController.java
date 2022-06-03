package com.csrlnd.LibraryAPI.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csrlnd.LibraryAPI.Model.Book;
import com.csrlnd.LibraryAPI.Model.Library;
import com.csrlnd.LibraryAPI.Model.LibraryMember;
import com.csrlnd.LibraryAPI.Model.Staff;
import com.csrlnd.LibraryAPI.Model.Student;
import com.csrlnd.LibraryAPI.Repositories.BookRepository;

@RestController
@RequestMapping(value = {"/books"})
public class BookController {

	@Autowired
	private BookRepository books;
	
	@Secured("ADMIN")
	 @GetMapping(value = {""})
	    public ResponseEntity findAll() {
		 return ResponseEntity.ok(books.findAll());
	    }
	

	 
	@Secured("ADMIN")
	 @GetMapping(value = {"/{id}"})
	    public ResponseEntity findById(@PathVariable String id) {
		  return ResponseEntity.ok(books.findById(id).get());
	    }
	 
	 @PostMapping(value = {""})
	    public Book addBook(@RequestBody Book book) {
		 return books.insert(book);
	    }
	 
	 @PutMapping(value = {""})
	    public Book EditOne(@RequestBody Book book) {
		 return books.save(book);
	    }
	 
	 @DeleteMapping(value = {"/{id}"})
	    public ResponseEntity DeleteOne(@PathVariable String id) {
		 books.deleteById(id);
		 return ResponseEntity.ok(null);
	    }
}
