package com.lkh.ht.carrental.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.aop.SpringProxy;
import com.lkh.ht.carrental.vo.Dept;

public interface DeptDao extends SpringProxy {
	public List<Dept> getAllDeptList();
	public Dept getDeptByDeptId(@Param("deptId")long deptId);
}