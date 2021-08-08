package com.benew.SchoolApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.benew.SchoolApp.entity.Student;
import com.benew.SchoolApp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(path = "/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "/students/{id}")
	public Student findStudentById(@PathVariable Long id ) {
		return studentService.getStudentById(id);
	}

	@PostMapping(path = "/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping(path = "students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping(path = "students/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}

}
