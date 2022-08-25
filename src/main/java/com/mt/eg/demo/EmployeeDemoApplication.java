package com.mt.eg.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeDemoApplication {
	@GetMapping("/Employee Management")
	public String Welcome()
	{
		return "Employee Management";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoApplication.class, args);
		ArrayList<Employee>emp=new ArrayList<Employee>();
		emp.add(new Employee(105,"Sony",25000));
		emp.add(new Employee(109,"Akhila",28000));
		emp.add(new Employee(101,"Sushma",23000));
		emp.add(new Employee(106,"Sriya",26000));
		emp.add(new Employee(104,"Pranay",30000));
		emp.add(new Employee(107,"Priya",35000));
		emp.add(new Employee(100,"Akhil",32000));
		emp.add(new Employee(103,"Karthik",34000));
		emp.add(new Employee(102,"Sahana",22000));
		emp.add(new Employee(108,"Kalyani",29000));
		for(Employee c:emp)
		{
		System.out.println(c);
}
}
	}

