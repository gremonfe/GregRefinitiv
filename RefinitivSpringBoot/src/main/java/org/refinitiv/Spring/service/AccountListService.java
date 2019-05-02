package org.refinitiv.Spring.service;

import java.util.List;

import org.refinitiv.Spring.entity.AccountList;;

/**
 * @author Gregorio Montiel
 *
 */
public interface AccountListService {
	
	 public List<AccountList> retrieveAccounts();
		
	 public AccountList getAccountList(Long userAccountId);
	 
	 public void saveAccountList(AccountList userAccount);
	 
	 public void deleteAccountList(Long userAccountId);
	 
	 public void updateAccountList(AccountList userAccount);

}
