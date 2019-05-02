package org.refinitiv.Spring.service;

import java.util.List;

import org.refinitiv.Spring.entity.UserList;
/**
 * @author Gregorio Montiel
 *
 */
public interface UserListService {
	
	 public List<UserList> retrieveUsers();
	
	 public UserList getUserList(Long userListId);
	 
	 public void saveUserList(UserList userList);
	 
	 public void deleteUserList(Long userListId);
	 
	 public void updateUserList(UserList userList);

}
