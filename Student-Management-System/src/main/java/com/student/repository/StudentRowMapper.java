package com.student.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.student.pojo.Student;

public class StudentRowMapper implements RowMapper<Student> {

	
	public Student mapRow(ResultSet rs , int RowNum) throws SQLException{
		
		return new Student(
			
			rs.getInt("id"),
			rs.getString("name"),
			rs.getInt("age"),
			rs.getString("email"),
			rs.getString("course")
		);
	}
}
