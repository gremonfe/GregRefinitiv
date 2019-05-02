package org.refinitiv.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Gregorio Montiel
 *
 */
@Entity
@Table(name="USER_LIST")

public class UserList {

	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="NAME")
	 private String name;
	 
	 @Column(name="ACCOUNT_LIST")
	 private Integer account;
	 
	 public Long getId() {
		return id;
	 }

	 public void setId(Long id) {
	  this.id = id;
	 }
	 
	 public String getName() {
	  return name;
	 }
	 
	 public void setName(String name) {
	  this.name = name;
	 }

	 public Integer getAccount() {
	  return account;
	 }

	 public void setAccount(Integer account) {
	  this.account = account;
	 }

	}
