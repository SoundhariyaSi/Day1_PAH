package com.example.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.Student;



import java.util.Arrays;

import java.util.List;

@RestController

public class ApiController {

	

	@GetMapping("sd")

	public List<Student> display()

	{

		return Arrays.asList(new Student("Sara","Have a great day"),new Student("Zara","Courage matters the most"));

	}



}
