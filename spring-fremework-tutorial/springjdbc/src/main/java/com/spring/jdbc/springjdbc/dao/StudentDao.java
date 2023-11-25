package com.spring.jdbc.springjdbc.dao;

import com.spring.jdbc.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int update(Student student);

	public int delete(int id);

	public Student getStudent(int id);

}
