/**
 *=========================================================
 * project:amw
 * package:com.lkh.amw.service
 * class:UserService.java
 *=========================================================
 * @author:lkh
 * @since:JDK1.7
 * @version:1.0
 *=========================================================
 * create time:2016年8月18日-下午9:05:35
 */
package com.lkh.ht.carrental.services;

import com.lkh.ht.carrental.vo.User;


/**
 * @author lkh
 * @createTime 2016年8月18日 下午9:05:35
 */
public interface UserService {
	/**
	 * Login
	 * @param user
	 * @return
	 * @author lkh
	 */
	public User getUserByName(User userLogin);
}
