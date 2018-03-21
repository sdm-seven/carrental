package com.lkh.ht.carrental.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lkh.ht.carrental.services.CarModelsService;
import com.lkh.ht.carrental.services.DeptService;
import com.lkh.ht.carrental.services.EmployeeService;
import com.lkh.ht.carrental.services.OrderService;
import com.lkh.ht.carrental.vo.CarModels;
import com.lkh.ht.carrental.vo.Dept;
import com.lkh.ht.carrental.vo.Order;
import com.lkh.ht.carrental.vo.User;
/**
 * @author lkh
 */
@Controller
@RequestMapping("/order")
public class OrderController {
	private static SimpleDateFormat SDF =  new SimpleDateFormat("yyyy-MM-dd");
	@Resource(name = "orderServiceImpl")
	private OrderService orderService;
	@Resource(name = "employeeServiceImpl")
	private EmployeeService employeeService;
	@Resource(name = "deptServiceImpl")
	private DeptService deptService;
	@Resource(name = "carModelsServiceImpl")
	private CarModelsService carModelsService;
	@RequestMapping(value = "/initOrder.do", method = RequestMethod.GET)
	public String initOrder(HttpServletRequest request, Model model){
		String getCarType = request.getParameter("srcType");
		Order order = new Order();
		order.setGetCarType(getCarType);
		model.addAttribute("order", order);
		List<Dept> deptList = deptService.getAllDeptList();
		model.addAttribute("deptList", deptList);
		return "smxc";
	}
	@RequestMapping(value = "/selectcar.do", method = RequestMethod.POST)
	public String selectCar(HttpServletRequest request, Model model) throws ParseException{
		String getCarType = request.getParameter("srcType");
		String sendAddress = request.getParameter("sendAddress");
		Date esd = SDF.parse(request.getParameter("esd"));
		Date eed = SDF.parse(request.getParameter("eed"));
		List<CarModels> carModelList = carModelsService.getAllCarModels();
		Order order = new Order();
		order.setGetCarType(getCarType);
		order.setAddr(sendAddress);
		order.setEstiStartDate(esd);
		order.setEstiEndDate(eed);
		order.setCarModelList(carModelList);
		model.addAttribute("order", order);
		return "selectcar";
	}
	@RequestMapping(value = "/createOrder.do", method = RequestMethod.POST)
	public String createOrder(){
		return "opResult";
	}
	@RequestMapping(value = "/processOrder.do", method = RequestMethod.POST)
	public String processOrder(HttpServletRequest request, Model model){
		Long orderId = Long.parseLong(request.getParameter("orderId"));
		Order order = orderService.getOrderById(orderId);
		order.setActualStartDate(new Date());
		model.addAttribute("order", order);
		return "admin/process";
	}
	@RequestMapping(value = "/process.do", method = RequestMethod.POST)
	public String process(HttpServletRequest request, Model model) throws ParseException{
		User user = (User)request.getSession().getAttribute("user");
		Order order = new Order();
		order.setOrderId(Long.parseLong(request.getParameter("orderId")));
		order.setOrderStatus(request.getParameter("orderStatus"));
		order.setActualStartDate(SDF.parse(request.getParameter("actualStartDate")));
		order.setCarId(Long.parseLong(request.getParameter("carId")));
		orderService.process(order, user, model);
		return "/admin/index";
	}
}
