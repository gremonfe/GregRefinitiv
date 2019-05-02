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
@Table(name="ACCOUNT_LIST")
public class AccountList {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="ACCOUNT_NAME")
	 private String name;
	 
	 @Column(name="ACCOUNT_CURRENCY")
	 private String currency;
	 
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

	 public String getCurrency() {
	  return currency;
	 }

	 public void setCurency(String currency) {
	  this.currency = currency;
	 }
}
