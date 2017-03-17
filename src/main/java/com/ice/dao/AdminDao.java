package com.ice.dao;

import java.util.List;
import java.util.Map;

import com.ice.entity.Admin;
import com.ice.entity.Module;
import com.ice.entity.page.Page;


public interface AdminDao {

	List<Admin> findByPage(Page page);

	int findRows(Page page);

	void updatePassword(Map<String, Object> param);

	Admin findById(int id);

	void saveAdmin(Admin admin);

	void saveAdminRoles(Map<String, Object> adminRoles);

	void updateAdmin(Admin admin);

	void deleteAdminRoles(int adminId);

	void deleteAdmin(int id);
	
	Admin findByCode(String adminCode);
	
	List<Module> findModulesByAdmin(int adminId);

}
