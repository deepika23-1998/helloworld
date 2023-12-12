package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface Studentrepos extends JpaRepository<Student, Integer> {//jpa rep is a interface used for crud operation
	//

}
