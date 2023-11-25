package com.spring.jdbc.springjdbc;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/app-config.xml")) {

			StudentDao studentDao = ctx.getBean("studentDaoImpl", StudentDao.class);

			Student student = new Student(4, "John", "London");

			int rs = studentDao.update(student);

			System.out.println("Number of reord updated ... " + rs + " with id " + student.getId());

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}
}
