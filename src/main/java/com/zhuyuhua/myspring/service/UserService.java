/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.service 
 * @FileName:UserService.java 
 * @Date:2014-1-14 下午5:38:32 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** 
 * @ClassName:UserService 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-14 下午5:38:32 
 * @Since:V 1.0 
 */
public class UserService
{
	/** 
	 * @Fileds:日志记录
	 * 
	 */
	private static final Logger logger = LogManager
			.getLogger(UserService.class);

	public void callUser() {
		logger.debug("==");
	}

}
