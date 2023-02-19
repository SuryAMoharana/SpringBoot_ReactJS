package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.Employee;
import com.practice.repositories.EmployeeRepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo eRepo;
	
	@GetMapping("/findAll")
	public List<Employee> getAllEmployees(){
		return eRepo.findAll();
	}

}
