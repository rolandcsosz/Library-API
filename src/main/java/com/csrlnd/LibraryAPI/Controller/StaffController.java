package com.csrlnd.LibraryAPI.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.csrlnd.LibraryAPI.Domain.Role;
import com.csrlnd.LibraryAPI.Domain.UserRole;
import com.csrlnd.LibraryAPI.Model.Library;
import com.csrlnd.LibraryAPI.Model.LibraryMember;
import com.csrlnd.LibraryAPI.Model.Staff;
import com.csrlnd.LibraryAPI.Model.Student;
import com.csrlnd.LibraryAPI.Repositories.LibraryRepository;
import com.csrlnd.LibraryAPI.Repositories.MemberRepository;
import com.csrlnd.LibraryAPI.Repositories.StaffRepository;

@RestController
@RequestMapping(value = {"/staff"})
public class StaffController {

	@Autowired
	private StaffRepository staff;
	
	 @GetMapping(value = {""})
	    public ResponseEntity findAll() {
		 return ResponseEntity.ok(staff.findAll());
	    }
	 
	 @GetMapping(value = {"/{id}"})
	    public ResponseEntity findById(@PathVariable String id) {
		  return ResponseEntity.ok(staff.findById(id).get());
	    }
	 
	 @PostMapping(value = {""})
	    public LibraryMember addmember(@RequestBody Staff member) {
		 return staff.insert(member);
	    }
	 
	 @PutMapping(value = {""})
	    public LibraryMember EditOne(@RequestBody Staff member) {
		 return staff.save(member);
	    }
	 
	 @DeleteMapping(value = {"/{id}"})
	    public ResponseEntity DeleteOne(@PathVariable String id) {
		 staff.deleteById(id);
		 return ResponseEntity.ok(null);
	    }
}
