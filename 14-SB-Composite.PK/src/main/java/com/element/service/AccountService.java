package com.element.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.dao.AccountDao;
import com.element.entity.Account;

@Service
public class AccountService {

	@Autowired
	private AccountDao adao;
	
	public void addAccountData() {
		Account ob = new Account(12345, 123456, 67890.90, "MAHAS0098", "Waluj", 12378, "Ritesh");
		adao.save(ob);
		
		Account a = new Account(12375, 123456, 67890.90, "MAHAS0098", "Waluj", 12378, "Ritesh");
		
		adao.save(a);
	}
}
