package org.refinitiv.Spring.controller;

import java.util.List;

import org.refinitiv.Spring.entity.UserList;
import org.refinitiv.Spring.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Gregorio Montiel
 *
 */
@RestController
public class UserListRestController {
	
@Autowired
private UserListService userListService;

public void setUserListService(UserListService userListService) {
	  this.userListService = userListService;
	 }

@GetMapping("/api/users")
public List<UserList> getUsers() {
 List<UserList> users = userListService.retrieveUsers();
 return users;
}

@GetMapping("/api/users/{userListId}")
public UserList getUserList(@PathVariable(name="User Id")Long userListId) {
 return userListService.getUserList(userListId);
}

@PostMapping("/api/users")
public void saveUserList(UserList userList){
 userListService.saveUserList(userList);
 System.out.println("User Saved Successfully");
}

@DeleteMapping("/api/users/{userListId}")
public void deleteUserList(@PathVariable(name="User Id")Long userListId){
 userListService.deleteUserList(userListId);
 System.out.println("User Deleted Successfully");
}

@PutMapping("/api/users/{userListId}")
public void updateUserList(@RequestBody UserList userList,
  @PathVariable(name="userListId")Long userListId){
 UserList usr = userListService.getUserList(userListId);
 if(usr != null){
  userListService.updateUserList(userList);
 }
 
}

}
