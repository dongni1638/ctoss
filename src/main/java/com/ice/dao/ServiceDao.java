package com.ice.dao;

import java.util.List;
import java.util.Map;

import com.ice.entity.Service;
import com.ice.entity.page.Page;


public interface ServiceDao {

	List<Map<String, Object>> findByPage(Page page);

	int findRows(Page page);
	
	void updateStatus(Service service);
	
	void pauseByAccount(int accountId);
	
	void deleteByAccount(int accountId);
	
	Service findById(int id);
	
	void save(Service service);
	
	void update(Service service);

}
