package com.zhuyuhua.myspring.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhuyuhua.myspring.dao.LogInfoDAO;
import com.zhuyuhua.myspring.model.LogInfo;

public class LogInfoDAOImpl implements LogInfoDAO {

	private static final Logger logger = LogManager
			.getLogger(LogInfoDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(LogInfo logInfo) {
		logger.debug(logInfo);
		Session session = sessionFactory.getCurrentSession();
		// session.beginTransaction();
		session.save(logInfo);
		throw new RuntimeException("插入LogInfo失败");
		// session.getTransaction().commit();
		// session.close();
	}

}
