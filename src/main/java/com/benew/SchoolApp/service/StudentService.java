package com.benew.SchoolApp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.benew.SchoolApp.entity.Student;
import com.benew.SchoolApp.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}

}
