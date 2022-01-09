package com.jdbc.spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl  implements  StudentDao{
	private JdbcTemplate jdbcTemplate;
	
//For insterting student detail into database
	public int insert(Student student) {
		String query = "insert into student(sid,name,city) values(?,?,?)";
		int r =  this.jdbcTemplate.update(query,student.getSid(),student.getName(),student.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	//For updating student detail into database
	public int change(Student student) {
		
		String query = "update student set name =?,city =? where sid =?";
		int s =  this.jdbcTemplate.update(query,student.getSid(),student.getName(),student.getCity());
		return s;
		}
	//For deleting student detail into database
	public int delete(int sid) {
		String query = "delete  from student where sid = ?";
		int s =  this.jdbcTemplate.update(query,sid);
		return s; 
	}

	public Student getStudent(int studentId) {
		String query = "select * from student where sid = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public List<Student> getAllStudentds() {
		String query = "select * from student";
		List<Student> list = this.jdbcTemplate.query(query, new RowMapperImpl());
		return list;
	} 

}
