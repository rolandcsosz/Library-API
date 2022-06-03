package com.csrlnd.LibraryAPI.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csrlnd.LibraryAPI.Model.Library;
import com.csrlnd.LibraryAPI.Model.LibraryMember;
import com.csrlnd.LibraryAPI.Model.Staff;
import com.csrlnd.LibraryAPI.Model.Student;
import com.csrlnd.LibraryAPI.Repositories.LibraryRepository;
import com.csrlnd.LibraryAPI.Repositories.MemberRepository;
import com.csrlnd.LibraryAPI.Repositories.StaffRepository;

@RestController
public class SessionController {
	
	 @PostMapping(value = {"/login"})
	    public ResponseEntity findAll() {
		 return ResponseEntity.ok("");
	    }
	 
	 @PostMapping(value = {"/logout"})
	    public ResponseEntity logout() {
		 SecurityContextHolder.getContext().setAuthentication(null);
		 return ResponseEntity.ok("");
	    }
	 
}
