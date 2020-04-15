package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Student;
import com.cg.service.StudentService1;

@CrossOrigin(origins="*")
@RestController
public class StudentController {
	@Autowired
	StudentService1 stuservice;
	
	@GetMapping(value="/student")
	public List<Student> fetchStudent()
	{
		System.out.println(stuservice.reterive());
		return stuservice.reterive();
	}
	
	
	
	@PostMapping(value="/student/new" ,consumes="application/json")
	public String addData(@RequestBody Student student)
	{
		stuservice.create(student);
		return"Record Inserted";
	}
	@DeleteMapping(value="/student/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		stuservice.delete(id);
		return "Record Deleted";
		
	}
	
	@PutMapping(value="/student" ,consumes="application/json")
	public void updateStudent( @RequestBody Student student)
	{     System.out.println("Updated Data "+student);
		  stuservice.update(student);
		//return "Record UPdated";
		
	}
	@GetMapping(value="/student/{id}")
	public Student getById(@PathVariable int id)
	{
		return stuservice.findById(id);
	}

}
