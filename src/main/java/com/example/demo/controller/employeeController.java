package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import com.example.demo.Employee;

import com.example.demo.Repository.EmployeeRepo;

@RequestMapping("/api")
@ResponseBody
@Controller

public class employeeController {
	
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("/hi")
    public String helloGFG() 
    { 
        return "employee"; 
    } 
	
	
	@GetMapping("/Employees")
	public List<Employee> allEmployees() {
		return employeeRepo.AllEmployees();
	}
	
	@PostMapping("/AddEmployees")
	public ResponseEntity<Object> AddEmployees(@RequestBody Employee employee) {
		 employeeRepo.AddEmployees(employee);	 
		 return new ResponseEntity<>("Employee added sucessfully",HttpStatus.OK);
	}
	
	@GetMapping("/RemoveEmployees/{id}")
	public 	ResponseEntity<Object> removeEmployeeById(@PathVariable Integer id) {
		 employeeRepo.removeEmployeebyId(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);}
	

}
