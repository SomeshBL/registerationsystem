package org.javatigers.userregisteration.service.user;

import java.util.List;

import org.javatigers.userregisteration.dao.user.repository.UserDAO;
import org.javatigers.userregisteration.dto.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author sk
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;
	
	public Integer save(User user) {
		return userDao.save(user);
	}

	public List<User> list() {
		return userDao.list();
	}

}
