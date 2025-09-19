package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.exception.StudentCustomException;
import com.student.pojo.Student;
import com.student.repository.StudentRowMapper;

@Repository
public class StudentDAO {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    public int save(Student student) {
        String sql = "INSERT INTO students(name, age, email, course) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getEmail(), student.getCourse());
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }
    

    public Student findById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
      
        List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper(), id);
    
        
        if (students.isEmpty()) {
            throw new StudentCustomException("STUDENT_NOT_FOUND",
            		"Student with ID " + id + " not found ");
        }
      return students.get(0);

    }

    public int update(Student student) {
        String sql = "UPDATE students SET name=?, age=?, email=?, course=? WHERE id=?";
        int rows = jdbcTemplate.update(sql,
                student.getName(),
                student.getAge(),
                student.getEmail(),
                student.getCourse(),
                student.getId()
        );

        if (rows == 0) {
            throw new StudentCustomException ("STUDENT_NOT_UPDATED", 
            		"Student with ID " + student.getId() + " not found");
        }
        return rows;
    }
    
    public int delete(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        int rows = jdbcTemplate.update(sql, id);

        if (rows == 0) {
            throw new StudentCustomException("STUDENT_NOT_DELETED",
                    "Student with ID " + id + " not found");
        }
        return rows;
    }
}
