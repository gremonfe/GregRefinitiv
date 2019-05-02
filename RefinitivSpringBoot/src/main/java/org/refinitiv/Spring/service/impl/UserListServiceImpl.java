package org.refinitiv.Spring.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.refinitiv.Spring.entity.UserList;
import org.refinitiv.Spring.repository.UserListRepository;
import org.refinitiv.Spring.service.UserListService;

/**
 * @author Gregorio Montiel
 *
 */
@Service
public class UserListServiceImpl implements UserListService {

 @Autowired
 private UserListRepository userListRepository;

 public void setUserListRepository(UserListRepository userListRepository) {
  this.userListRepository = userListRepository;
 }
 
 public List<UserList> retrieveUsers() {
  List<UserList> users = userListRepository.findAll();
  return users;
 }
 
 public UserList getUserList(Long userListId) {
  Optional<UserList> optUsr = userListRepository.findById(userListId);
  return optUsr.get();
 }
 
 public void saveUserList(UserList userList){
	 userListRepository.save(userList);
 }
 	
 public void deleteUserList(Long userListId){
	 userListRepository.deleteById(userListId);
 }
 
 public void updateUserList(UserList userList) {
	 userListRepository.save(userList);
 }


}