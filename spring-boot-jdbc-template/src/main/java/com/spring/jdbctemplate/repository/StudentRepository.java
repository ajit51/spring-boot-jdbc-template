package com.spring.jdbctemplate.repository;

import java.util.List;

import com.spring.jdbctemplate.model.Student;

public interface StudentRepository {

	int addStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	int updateStudent(Student student);

	int deleteStudentById(int id);

}
