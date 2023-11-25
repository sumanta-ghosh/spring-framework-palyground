package com.spring.jdbc.springjdbc;

import java.util.List;

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

			StudentDao studentDaoImpl = ctx.getBean("studentDaoImpl", StudentDao.class);

			Student student = new Student(7, "John", "London");
			studentDaoImpl.insert(student);
			// int rs = studentDaoImpl.update(student);
			// int rs = studentDaoImpl.delete(2);

			List<Student> rs = studentDaoImpl.getAllStudent();
			for (Student std : rs) {
				System.out.println(std);
			}

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
