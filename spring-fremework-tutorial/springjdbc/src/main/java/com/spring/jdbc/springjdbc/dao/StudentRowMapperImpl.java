package com.spring.jdbc.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.entities.Student;

public class StudentRowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
		return student;
	}

}
