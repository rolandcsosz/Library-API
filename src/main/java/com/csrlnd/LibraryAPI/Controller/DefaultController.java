package com.csrlnd.LibraryAPI.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {


	@GetMapping("/")
	public String getBase() {
		return "";
	}

	
}
