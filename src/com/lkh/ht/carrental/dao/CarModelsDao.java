package com.lkh.ht.carrental.dao;

import java.util.List;
import org.springframework.aop.SpringProxy;
import com.lkh.ht.carrental.vo.CarModels;

public interface CarModelsDao extends SpringProxy {
	public List<CarModels> getAllCarModels();
}