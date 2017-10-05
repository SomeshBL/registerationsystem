package org.javatigers.userregisteration.service.user;

import java.util.List;

import org.javatigers.userregisteration.dto.user.User;

public interface UserService {
	
	public Integer save(User user);
	
	public List<User> list();

}
