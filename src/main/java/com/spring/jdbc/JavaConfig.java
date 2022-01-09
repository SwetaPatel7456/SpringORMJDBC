package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.spring.dao.StudentDao;
import com.jdbc.spring.dao.StudentDaoImpl;
import com.spring.jdbc.entity.Student;

@Configuration
public class JavaConfig {
	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dmds.setUsername("root");
		dmds.setPassword("7785");
		return dmds;
	}
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
		
	}
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl sd = new  StudentDaoImpl();
		sd.setJdbcTemplate(getTemplate());
		return sd;
	}
	@Bean("student1")
	public Student getStudent() {
		Student s = new Student() ;
		s.setSid(90);
		s.setName("dddd");
		s.setCity("Khutar");
		return s;
			
		
	}

}
