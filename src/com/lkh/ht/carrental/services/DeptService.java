package com.lkh.ht.carrental.services;

import java.util.List;

import com.lkh.ht.carrental.vo.Dept;

public interface DeptService {

	public List<Dept> getAllDeptList();

	public Dept getDeptByDeptId(long deptId);

}
