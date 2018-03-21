package com.lkh.ht.carrental.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lkh.ht.carrental.dao.CarModelsDao;
import com.lkh.ht.carrental.services.CarModelsService;
import com.lkh.ht.carrental.vo.CarModels;
/**
 * @author lkh
 */
@Service("carModelsServiceImpl") 
public class CarModelsServiceImpl implements CarModelsService{
	@Autowired
	private CarModelsDao carModelsDao;
	@Override
	public List<CarModels> getAllCarModels() {
		return carModelsDao.getAllCarModels();
	}

}
