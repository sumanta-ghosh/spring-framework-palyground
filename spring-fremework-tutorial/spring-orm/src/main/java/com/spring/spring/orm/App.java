package com.spring.spring.orm;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring.orm.dao.StudentDaoImpl;
import com.spring.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/spring/orm/app-config.xml");

		StudentDaoImpl studentDao = ctx.getBean("studentDaoImpl2", StudentDaoImpl.class);

		/*
		 * Student std = new Student(6, "Ranjan", "Deshra"); studentDao.save(std);
		 */

		Student student = studentDao.getStudent(1);
		System.out.println(student);

		student.setName("Anupam");
		student.setCity("Kotulpur");
		studentDao.update(student);

		List<Student> allStudent = studentDao.getAll();

		for (Student getAll : allStudent) {
			System.out.println(getAll);
		}

		// delete student
		// studentDao.delete(2);

		ctx.close();

	}
}
