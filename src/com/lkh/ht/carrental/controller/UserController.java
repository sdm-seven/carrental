/**
 *=========================================================
 * class:UserController.java
 *=========================================================
 * @author:lkh
 * @since:JDK1.7
 * @version:1.0
 *=========================================================
 */
package com.lkh.ht.carrental.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lkh.ht.carrental.services.DeptService;
import com.lkh.ht.carrental.services.EmployeeService;
import com.lkh.ht.carrental.services.OrderService;
import com.lkh.ht.carrental.services.UserService;
import com.lkh.ht.carrental.vo.Dept;
import com.lkh.ht.carrental.vo.Employee;
import com.lkh.ht.carrental.vo.Order;
import com.lkh.ht.carrental.vo.User;
/**
 * @author lkh
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userServiceImpl")
	private UserService userService;
	@Resource(name = "deptServiceImpl")
	private DeptService deptService;
	@Resource(name = "employeeServiceImpl")
	private EmployeeService employeeService;
	@Resource(name = "orderServiceImpl")
	private OrderService orderService;
	private String toIndex(User user, String adminFlag, Model model){
		if(!StringUtils.isEmpty(adminFlag)){
			Employee employee = employeeService.getEmployeeByUserId(user.getUserId());
			if(null == employee){
				return "/admin/error";
			}else{
				employee.setUser(user);
				Dept dept = deptService.getDeptByDeptId(employee.getDeptId());
				employee.setDept(dept);
				List<Order> orderList = orderService.getOrderListByDeptId(employee.getDeptId());
				model.addAttribute("employee", employee);
				model.addAttribute("orderList", orderList);
				return "/admin/index";
			}
		}
		model.addAttribute("user", user);
		return "index";
	}
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String regUser(HttpServletRequest request, Model model){
		return "login";
	}
	@RequestMapping(value = "/intiLogin.do", method = RequestMethod.GET)
	public String initLogin(HttpServletRequest request, Model model) {
		User user = (User)request.getSession().getAttribute("user");
		if(null != user){
			return this.toIndex(user, "", model);
		}
		return "login";
	}
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		String userName = StringUtils.isEmpty(request.getParameter("userphone")) 
							?request.getParameter("username")
							:request.getParameter("userphone");
		String passWord = request.getParameter("password");
		String adminFlag = request.getParameter("adminFlag");
		User userLogin = new User();
		userLogin.setUserName(userName);
		userLogin.setPassWord(passWord);
		User user = this.userService.getUserByName(userLogin);
		if (null != user) {
			request.getSession().setAttribute("user", user);
			return this.toIndex(user, adminFlag, model);
		} else {
			model.addAttribute("user", null);
			return "login";
		}
	}
}
