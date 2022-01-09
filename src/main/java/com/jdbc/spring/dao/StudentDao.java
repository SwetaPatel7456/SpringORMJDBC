package com.jdbc.spring.dao;

import com.spring.jdbc.entity.Student;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int i);
	public Student getStudent(int studentId);
	public List<Student> getAllStudentds();
		
	
	


}