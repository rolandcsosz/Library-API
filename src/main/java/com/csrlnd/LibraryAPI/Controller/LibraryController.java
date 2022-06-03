package com.csrlnd.LibraryAPI.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.csrlnd.LibraryAPI.Repositories.LibraryRepository;
import com.csrlnd.LibraryAPI.Repositories.MemberRepository;

@RolesAllowed("USER")
@RestController
@RequestMapping(value = {"/libraries"})
public class LibraryController {

	@Autowired
	private LibraryRepository libraries;
	
	 @GetMapping(value = {""})
	    public ResponseEntity findAll() {
		 return ResponseEntity.ok(libraries.findAll());
	    }
	 
	 @GetMapping(value = {"/{id}"})
	    public ResponseEntity findById(@PathVariable String id) {
		  return ResponseEntity.ok(libraries.findById(id).get());
	    }

	 
	 @PostMapping(value = {""})
	    public Library addlibrary(@RequestBody Library library) {
		 return libraries.insert(library);
	    }
	 
	 @PutMapping(value = {""})
	    public Library EditOne(@RequestBody Library library) {
		 
		 libraries.deleteById(library.getId());
		 return libraries.save(library);
	    }
	 
	 @DeleteMapping(value = {"/{id}"})
	    public ResponseEntity DeleteOne(@PathVariable String id) {
		 libraries.deleteById(id);
		 return ResponseEntity.ok(null);
	    }
}
