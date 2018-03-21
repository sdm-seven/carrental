package com.lkh.ht.carrental.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lkh.ht.carrental.services.DeptService;

/**
 * @author lkh
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
	@Resource(name = "deptServiceImpl")
	private DeptService deptService;
}
