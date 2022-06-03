package com.csrlnd.LibraryAPI.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
import com.csrlnd.LibraryAPI.Repositories.LibraryRepository;
import com.csrlnd.LibraryAPI.Repositories.MemberRepository;

@RestController
@RequestMapping(value = {"/members"})
public class MemberController {

	@Autowired
	private MemberRepository members;
	
	 @GetMapping(value = {""})
	    public ResponseEntity findAll() {
		 return ResponseEntity.ok(members.findAll());
	    }
	 
	 @GetMapping(value = {"/{id}"})
	    public ResponseEntity findById(@PathVariable String id) {
		  return ResponseEntity.ok(members.findById(id).get());
	    }
	 
	 @GetMapping(value = {"/{id}/books"})
	    public ResponseEntity findBooksById(@PathVariable String id) {
		  return ResponseEntity.ok(members.findById(id).get().getBooks());
	    }
	 
	 @PostMapping(value = {""})
	    public Student addmember(@RequestBody Student member) {
		 return members.insert(member);
	    }
	 
	 @PutMapping(value = {""})
	    public Student EditOne(@RequestBody Student member) {
		 return members.save(member);
	    }
	 
	 @DeleteMapping(value = {"/{id}"})
	    public ResponseEntity DeleteOne(@PathVariable String id) {
		 members.deleteById(id);
		 return ResponseEntity.ok(null);
	    }
}
