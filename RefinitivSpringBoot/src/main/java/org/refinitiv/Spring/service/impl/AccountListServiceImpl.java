package org.refinitiv.Spring.service.impl;

import java.util.List;
import java.util.Optional;
import org.refinitiv.Spring.entity.AccountList;
import org.refinitiv.Spring.repository.AccountListRepository;
import org.refinitiv.Spring.service.AccountListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountListServiceImpl implements AccountListService{

	 @Autowired
	 private AccountListRepository accountListRepository;

	 public void setAccountListRepository(AccountListRepository accountListRepository) {
	  this.accountListRepository = accountListRepository;
	 }
	 
	 public List<AccountList> retrieveAccounts() {
	  List<AccountList> accounts = accountListRepository.findAll();
	  return accounts;
	 }
	 
	 public AccountList getAccountList(Long accountListId) {
	  Optional<AccountList> optAcc = accountListRepository.findById(accountListId);
	  return optAcc.get();
	 }
	 
	 public void saveAccountList(AccountList accountList){
		 accountListRepository.save(accountList);
	 }
	 	
	 public void deleteAccountList(Long accountListId){
		 accountListRepository.deleteById(accountListId);
	 }
	 
	 public void updateAccountList(AccountList accountList) {
		 accountListRepository.save(accountList);
	 }
}
