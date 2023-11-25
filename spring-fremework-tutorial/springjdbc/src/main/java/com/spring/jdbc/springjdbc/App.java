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

			StudentDao studentDaoImpl = ctx.getBean("studentDaoImpl", StudentDao.class);

			// Student student = new Student(4, "John", "London");
			// int rs = studentDaoImpl.insert(student);
			// int rs = studentDaoImpl.update(student);
			// int rs = studentDaoImpl.delete(2);

			Student rs = studentDaoImpl.getStudent(1);
			System.out.println(rs);

			Student rs1 = studentDaoImpl.getStudent(2);
			System.out.println(rs1);

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
