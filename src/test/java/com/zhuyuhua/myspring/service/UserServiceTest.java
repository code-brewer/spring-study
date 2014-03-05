package com.zhuyuhua.myspring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuyuhua.myspring.core.SpringTransactionalTestCase;
import com.zhuyuhua.myspring.model.User;

public class UserServiceTest extends SpringTransactionalTestCase {

	private static final Logger logger = LogManager
			.getLogger(UserServiceTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void testAdd() {
		User user = new User();
		user.setUserName("121");
		user.setPassword("password");
		userService.addUser(user);
	}

}
