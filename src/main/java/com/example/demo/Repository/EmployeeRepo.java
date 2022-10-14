package com.example.demo.Repository;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import com.example.demo.Employee;

@Component

public class EmployeeRepo {
	public static int usersCount=5;
	//creating an instance of ArrayList
	
	private static List<Employee> EmployeeList=new LinkedList<Employee>();
	static {
	EmployeeList.add(new Employee(1,"Akhila","Nerella",1,"USBAY","akhila@gmail.com",123));
	EmployeeList.add(new Employee(2,"nikil","subramanian",1,"USEAST","nikil@gmail.com",125));
	EmployeeList.add(new Employee(3,"peter","tan",1,"AZ","petertan@gmail.com",123));
	EmployeeList.add(new Employee(4,"samson","tan",1,"AL","samsontan@gmail.com",126));
	EmployeeList.add(new Employee(5,"kiki","chan",1,"AL","kikichan@gmail.com",126));
	}
	
	
	public List<Employee> AllEmployees() {
		
		
		return EmployeeList;
	}
	public Employee AddEmployees(Employee employee){
		
		if(employee.getEmployeeId()==null) {
			employee.setEmployeeId(++usersCount);
			
		}
		EmployeeList.add(employee);
		return employee;
	}
	
	public 	ResponseEntity<Object>  removeEmployeebyId(Integer id) {
		if(id.equals(null)) {
			return new ResponseEntity<>("Please pass a valid ID", HttpStatus.BAD_REQUEST);
		}

		Iterator<Employee> iter = EmployeeList.iterator();
		while (iter.hasNext()) {
		    Employee emp = iter.next();

		    if (emp.getEmployeeId()==id)
		        iter.remove();
		}
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	
		
	}

}
