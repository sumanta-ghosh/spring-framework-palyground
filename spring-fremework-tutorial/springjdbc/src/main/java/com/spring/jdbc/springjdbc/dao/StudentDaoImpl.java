package com.spring.jdbc.springjdbc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.springjdbc.entities.Student;

@Component("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO student(id,name,city) values(?,?,?)";
		return this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
	}

	@Override
	public int update(Student student) {
		String query = "UPDATE student SET name=?, city=?  WHERE id=? ";
		return this.jdbctemplate.update(query, student.getName(), student.getCity(), student.getId());
	}

	@Override
	public int delete(int id) {
		String query = "DELETE FROM student WHERE id=?";
		return this.jdbctemplate.update(query, id);
	}

	@Override
	public Optional<Student> getStudent(int id) {
		String query = "SELECt * FROM student where id=?";

		RowMapper<Student> rowMapper = new StudentRowMapperImpl();

		try {
			Student student = this.jdbctemplate.queryForObject(query, rowMapper, id);
			return Optional.of(student);
		} catch (EmptyResultDataAccessException e) {
			return Optional.empty();
		}
	}

	@Override
	public List<Student> getAllStudent() {
		String query = "SELECt * FROM student";
		RowMapper<Student> rowMapper = new StudentRowMapperImpl();
		return this.jdbctemplate.query(query, rowMapper);
	}

}
