package com.spring.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void save(Student student) {
		this.hibernateTemplate.save(student);
	}

	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	@Transactional
	public void delete(int id) {
		Student student = getStudent(id);
		this.hibernateTemplate.delete(student);
	}

	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getAll() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
