package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.Studentserv;
@RestController
@RequestMapping("/student")
public class Studentcontrol {
	@Autowired
	private Studentserv studentserv;
	
	
	@PostMapping("/insert")
	public Student insert(@RequestBody Student student) {
		return studentserv.insert(student);
	}
	
	@GetMapping("/get")
	public List<Student> get(){
		return studentserv.getAllDetail();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getByID(@PathVariable int id){
		return new ResponseEntity<Student>(studentserv.getByID(id), HttpStatus.OK);
	}
	
}









	 