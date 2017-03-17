package com.ice.dao;

import java.util.List;

import com.ice.entity.Account;
import com.ice.entity.page.Page;


public interface AccountDao {

	List<Account> findByPage(Page page);

	int findRows(Page page);
	
	void updateStatus(Account account);
	
	Account findById(int id);

	void update(Account account);

	void save(Account account);
	
	Account findByIdcardNo(String idcardNo);
	
}
