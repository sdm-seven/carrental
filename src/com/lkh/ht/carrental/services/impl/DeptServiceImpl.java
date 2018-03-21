package com.lkh.ht.carrental.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lkh.ht.carrental.dao.DeptDao;
import com.lkh.ht.carrental.services.DeptService;
import com.lkh.ht.carrental.vo.Dept;
/**
 * @author lkh
 */
@Service("deptServiceImpl") 
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;
	/* (non-Javadoc)
	 * @see com.lkh.ht.carrental.services.DeptService#getAllDept()
	 */
	@Override
	public List<Dept> getAllDeptList() {
		// TODO Auto-generated method stub
		return deptDao.getAllDeptList();
	}
	/* (non-Javadoc)
	 * @see com.lkh.ht.carrental.services.DeptService#getDeptByDeptId(long)
	 */
	@Override
	public Dept getDeptByDeptId(long deptId) {
		return deptDao.getDeptByDeptId(deptId);
	}

}
