package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDaoImpl;
import springmvc.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;

	public int saveUser(User user) {
		return this.userDaoImpl.saveUser(user);
	}

}
