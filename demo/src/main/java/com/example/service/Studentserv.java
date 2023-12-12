package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Student;
import com.example.repository.Studentrepos;
@Service
public class Studentserv {
	@Autowired
	private Studentrepos studentrep;  // entire crud methods got implecitly in this class 
	
	public Student insert(@RequestBody Student student) {
		return studentrep.save(student);
		}
	
	public List<Student> getAllDetail(){
		return studentrep.findAll();
	}
	
	public Student getByID(int id) {
		return studentrep.findById(id).get();
	}
	
}





