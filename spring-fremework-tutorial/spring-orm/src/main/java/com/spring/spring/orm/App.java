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
		 * Student std = new Student(2, "Anupam", "Deshra"); studentDao.save(std);
		 */

		Student student = studentDao.getStudent(2);
		System.out.println(student);

		List<Student> allStudent = studentDao.getAll();

		for (Student std : allStudent) {
			System.out.println(std);
		}

		// delete student
		// studentDao.delete(2);

		ctx.close();

	}
}
