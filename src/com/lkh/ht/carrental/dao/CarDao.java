package com.lkh.ht.carrental.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.aop.SpringProxy;

import com.lkh.ht.carrental.vo.Car;

public interface CarDao extends SpringProxy {

	public List<Car> getCarListByCtId(@Param("ctId")long ctId);
}