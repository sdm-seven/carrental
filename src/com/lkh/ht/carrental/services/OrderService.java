package com.lkh.ht.carrental.services;

import java.util.List;

import org.springframework.ui.Model;

import com.lkh.ht.carrental.vo.Order;
import com.lkh.ht.carrental.vo.User;

public interface OrderService {

	public List<Order> getOrderListByDeptId(long deptId);

	public Order getOrderById(Long orderId);

	public void process(Order order, User user, Model model);

}
