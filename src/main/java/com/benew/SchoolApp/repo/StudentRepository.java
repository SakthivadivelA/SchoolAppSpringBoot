package com.benew.SchoolApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benew.SchoolApp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
