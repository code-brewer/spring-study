package com.zhuyuhua.myspring.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.zhuyuhua.myspring.dao.LogInfoDAO;
import com.zhuyuhua.myspring.dao.UserDAO;
import com.zhuyuhua.myspring.model.User;
import com.zhuyuhua.myspring.service.UserService;

public class UserServiceImpl implements UserService {

	private static final Logger logger = LogManager
			.getLogger(UserServiceImpl.class);

	private UserDAO userDAO;
	private LogInfoDAO logInfoDAO;

	public void setLogInfoDAO(LogInfoDAO logInfoDAO) {
		this.logInfoDAO = logInfoDAO;
	}

	// @Resource(name = "user")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.save(user);
		// LogInfo info = new LogInfo();
		// info.setMsg("add user:name=" + user.getUserName());
		// this.logInfoDAO.save(info);
	}

	@Override
	public void callUser() {
		logger.debug("==");
	}

}
