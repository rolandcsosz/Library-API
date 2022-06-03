package com.csrlnd.LibraryAPI;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.csrlnd.LibraryAPI.Model.Book;

@SpringBootApplication
public class LibraryApiApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

}
