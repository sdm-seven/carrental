package com.lkh.ht.carrental.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.lkh.ht.carrental.dao.CarDao;
import com.lkh.ht.carrental.dao.DeptDao;
import com.lkh.ht.carrental.dao.EmployeeDao;
import com.lkh.ht.carrental.dao.OrderDao;
import com.lkh.ht.carrental.services.OrderService;
import com.lkh.ht.carrental.vo.Car;
import com.lkh.ht.carrental.vo.Dept;
import com.lkh.ht.carrental.vo.Employee;
import com.lkh.ht.carrental.vo.Order;
import com.lkh.ht.carrental.vo.User;
/**
 * @author lkh
 */
@Service("orderServiceImpl") 
public class OrderServiceImpl implements OrderService  {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DeptDao deptDao;
	@Autowired
	private CarDao carDao;
	/* (non-Javadoc)
	 * @see com.lkh.ht.carrental.services.OrderService#getOrderListByDeptId(long)
	 */
	@Override
	public List<Order> getOrderListByDeptId(long deptId) {
		return orderDao.getOrderListByDeptId(deptId);
	}
	@Override
	public Order getOrderById(Long orderId) {
		Order order = orderDao.getOrderById(orderId);
		List<Car> carList = carDao.getCarListByCtId(order.getCtId());
		order.setCarList(carList);
		return order;
	}
	@Override
	public void process(Order order, User user, Model model) {
//		orderDao.updateOrderById(order);
		Employee employee = employeeDao.getEmployeeByUserId(user.getUserId());
		employee.setUser(user);
		Dept dept = deptDao.getDeptByDeptId(employee.getDeptId());
		employee.setDept(dept);
		List<Order> orderList = orderDao.getOrderListByDeptId(employee.getDeptId());
		model.addAttribute("employee", employee);
		model.addAttribute("orderList", orderList);
	}

}
