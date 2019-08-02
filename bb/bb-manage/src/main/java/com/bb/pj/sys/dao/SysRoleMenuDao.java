package com.bb.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMenuDao {
	
	 int deleteObjectsByRoleId
	 (Integer roleId);
	 int insertObjects(
				@Param("roleId")Integer roleId,
				@Param("menuIds")Integer[] menuIds);
	 
	 int findMenuIdsByRoleId(Integer id);
	//int insertObjects(Integer id, Integer[] menuIds);
		List<Integer> findMenuIdsByRoleIds(
				@Param("roleIds")Integer[] roleIds);
}
