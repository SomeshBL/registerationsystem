package org.javatigers.userregisteration.ws.user;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javatigers.userregisteration.dto.user.User;
import org.javatigers.userregisteration.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @author sk
 *
 */
@Path("/user")
public class UserWSV1 {

	@Autowired
	private UserService userService;
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Integer createUser(User user){
		return userService.save(user);
	}
	
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public List<User> list(){
		return userService.list();
	}
}
