package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDAO;
import com.student.pojo.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	// add student to DB
	
	public void addStudent(Student student) {
		studentDAO.save(student);
	}
	
	// get all student from DB
	
	public List<Student> getAllStudent(){
		return studentDAO.findAll();
	}
	
	// get student by ID
	
	public Student getStudentById(int id) {
		return studentDAO.findById(id);
	}
	
	// update student
	
	public void updateStudent(Student student) {
		studentDAO.update(student);
	}
	
	// delete student
	
	public void deleteStudent(int id) {
		studentDAO.delete(id);
	}

}
