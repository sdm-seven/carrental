package com.lkh.ht.carrental.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lkh.ht.carrental.dao.UserDao;
import com.lkh.ht.carrental.services.UserService;
import com.lkh.ht.carrental.vo.User;

/**
 * @author lkh
 * @createTime 2016年8月18日 下午8:54:16
 */
@Service("userServiceImpl")  
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByName(User userLogin) {
		User user = userDao.getUserByName(userLogin.getUserName());
		if(null != user && !"".equals(userLogin.getPassWord()) && userLogin.getPassWord().equals(user.getPassWord())){
			return user;
		}else{
			return null;
		}
	}

}
