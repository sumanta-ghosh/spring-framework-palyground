package com.spring.jdbc.springjdbc.dao;

import java.util.List;
import java.util.Optional;

import com.spring.jdbc.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int update(Student student);

	public int delete(int id);

	public Optional<Student> getStudent(int id);

	public List<Student> getAllStudent();

}
