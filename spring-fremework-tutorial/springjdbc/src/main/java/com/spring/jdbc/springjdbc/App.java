package com.spring.jdbc.springjdbc;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/app-config.xml")) {
			JdbcTemplate db = ctx.getBean("jdbctemplate", JdbcTemplate.class);

			// insert query
			String query = "INSERT INTO student(id,name,city) values(?,?,?)";
			int rs = db.update(query, 2, "Saheb", "Kotulpur");
			System.out.println("Number of reord inserted ... " + rs);

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}
}
