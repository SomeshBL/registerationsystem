package org.javatigers.userregisteration.dao.user.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.javatigers.userregisteration.dao.user.UserEntity;
import org.javatigers.userregisteration.dto.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sk
 *
 */
@Repository
public class UserDAO {
	
	@Autowired
	private UserJpaRepository userJpaRepository;

	/**
	 * Method to save the user in database
	 * @param user
	 * @return
	 */
	public Integer save(User user){
		UserEntity userEntity = new UserEntity(user);
		return userJpaRepository.save(userEntity).getId();
	}
	
	/**
	 * Method to list all the user from the database
	 * @return
	 */
	public List<User> list(){
		return userJpaRepository.findAll()
				.stream()
				.map(user->user.toUser())
				.collect(Collectors.toList());
	}
}
