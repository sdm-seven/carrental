package com.lkh.ht.carrental.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.aop.SpringProxy;
import com.lkh.ht.carrental.vo.User;

public interface UserDao extends SpringProxy {
	public User getUserByName(@Param("un")String userName);
}