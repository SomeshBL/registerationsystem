package org.javatigers.userregisteration.dao.user.repository;

import org.javatigers.userregisteration.dao.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author sk
 *
 */
public interface UserJpaRepository extends JpaRepository<UserEntity, Long>{

}
