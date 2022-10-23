package com.gl.studentmanagement.service;

import java.util.*;
import java.lang.*;

import com.gl.studentmanagement.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();
	
	public Student findById(int theId);
	
	public void save(Student theStudent);
	
	public void deleteById(int theId);
	
	public List<Student> searchBy(String name,String country);
	
}