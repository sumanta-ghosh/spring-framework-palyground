package com.spring.spring.orm.dao;

import java.util.List;

import com.spring.spring.orm.entities.Student;

public interface StudentDao {

	public void save(Student student);

	public void update(Student student);

	public void delete(int id);

	public Student getStudent(int id);

	public List<Student> getAll();

}
