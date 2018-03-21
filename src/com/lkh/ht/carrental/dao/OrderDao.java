package com.lkh.ht.carrental.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.aop.SpringProxy;

import com.lkh.ht.carrental.vo.Order;

public interface OrderDao extends SpringProxy {
	public List<Order> getOrderListByUserId(@Param("userId")long userId);

	public List<Order> getOrderListByDeptId(@Param("deptId")long deptId);

	public Order getOrderById(@Param("orderId")Long orderId);

	public void updateOrderById(Order order);
}