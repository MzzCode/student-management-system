package com.student.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {
	
	 	private int id;
	 	
	 	@NotBlank (message= "Name is required not be blank")   
	 	private String name;
	    
	 	@Min(value = 5, message = "Age must be >= 5")
	 	@Max(value = 60, message = "Age must be <= 60")
	 	private int age;
	 	
	 	@Email (message = "Invalid email format")
	    private String email;
	 	
	 	@NotBlank (message = "Course is required not be blank")
	    private String course;
	    
	
	 // all and no argument constructor
	
	public Student() {
		
	}
	
	public Student(int id, String name, int age, String email, String course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.course = course;
		
	}
	
	// getter and setter
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
		
	}
	

}
