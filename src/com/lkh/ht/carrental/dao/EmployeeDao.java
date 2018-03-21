package com.lkh.ht.carrental.dao;

import org.apache.ibatis.annotations.Param;

import com.lkh.ht.carrental.vo.Employee;

public interface EmployeeDao {
	public Employee getEmployeeByUserId(@Param("userId")long userId);
}
