package com.ice.dao;

import java.util.List;
import java.util.Map;

import com.ice.entity.Module;
import com.ice.entity.Role;
import com.ice.entity.page.Page;

public interface RoleDao {

	List<Role> findByPage(Page page);

	int findRows(Page page);
	
	List<Module> findAllModules();
	
	Role findById(int id);
	
	void saveRole(Role role);
	
	void saveRoleModules(Map<String,Object> roleModules);
	
	void updateRole(Role role);
	
	void deleteRoleModules(int roleId);
	
	void deleteRole(int roleId);
	
	Role findByName(String name);
	
}
