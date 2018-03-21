package com.lkh.ht.carrental.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lkh.ht.carrental.dao.EmployeeDao;
import com.lkh.ht.carrental.services.EmployeeService;
import com.lkh.ht.carrental.vo.Employee;

/**
 * @author lkh
 */
@Service("employeeServiceImpl") 
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	/* (non-Javadoc)
	 * @see com.lkh.ht.carrental.services.EmployeeService#getEmployeeByUserId(long)
	 */
	@Override
	public Employee getEmployeeByUserId(long userId) {
		return employeeDao.getEmployeeByUserId(userId);
	}
	
}
