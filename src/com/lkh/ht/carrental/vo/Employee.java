package com.lkh.ht.carrental.vo;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private long employeeId;
	private long userId;
	private User user=new User();
	private long deptId;
	private Dept dept = new Dept();
	private List<Order> orderList = new ArrayList<Order>();
	private String enableFlag;
	/**
	 * @return the employeeId
	 */
	public long getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the deptId
	 */
	public long getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	/**
	 * @return the enableFlag
	 */
	public String getEnableFlag() {
		return enableFlag;
	}
	/**
	 * @param enableFlag the enableFlag to set
	 */
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	/**
	 * @return the orderList
	 */
	public List<Order> getOrderList() {
		return orderList;
	}
	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
}
