package com.lkh.ht.carrental.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lkh.ht.carrental.services.CarModelsService;

/**
 * @author lkh
 */
@Controller
@RequestMapping("/carModels")
public class CarModelsController {
	@Resource(name = "carModelsServiceImpl")
	private CarModelsService carModelsService;
}
