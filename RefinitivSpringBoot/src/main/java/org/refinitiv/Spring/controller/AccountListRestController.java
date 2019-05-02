package org.refinitiv.Spring.controller;

import java.util.List;

import org.refinitiv.Spring.entity.AccountList;
import org.refinitiv.Spring.service.AccountListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountListRestController {
	
@Autowired
private AccountListService accountListService;

public void setAccountListService(AccountListService accountListService) {
	  this.accountListService = accountListService;
	 }

@GetMapping("/api/accounts")
public List<AccountList> getAccounts() {
 List<AccountList> accounts = accountListService.retrieveAccounts();
 return accounts;
}

@GetMapping("/api/users/{accountListId}")
public AccountList getAccountList(@PathVariable(name="Account Id")Long accountListId) {
 return accountListService.getAccountList(accountListId);
}

@PostMapping("/api/accounts")
public void saveAccountList(AccountList accountList){
accountListService.saveAccountList(accountList);
 System.out.println("Account Saved Successfully");
}

@DeleteMapping("/api/accounts/{accountListId}")
public void deleteAccountList(@PathVariable(name="Account Id")Long accountListId){
accountListService.deleteAccountList(accountListId);
 System.out.println("Account Deleted Successfully");
}

@PutMapping("/api/accounts/{accountListId}")
public void updateAccountList(@RequestBody AccountList accountList,
  @PathVariable(name="accountListId")Long accountListId){
AccountList acc = accountListService.getAccountList(accountListId);
 if(acc != null){
accountListService.updateAccountList(accountList);
 }
 
}
}
