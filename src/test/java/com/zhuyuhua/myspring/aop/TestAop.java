/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.aop 
 * @FileName:TestAop.java 
 * @Date:2014-1-26 上午11:06:27 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuyuhua.myspring.aop.business.IBaseBusiness;
import com.zhuyuhua.myspring.controller.LoginControllerTest;


/** 
 * @ClassName:TestAop 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-26 上午11:06:27 
 * @Since:V 1.0 
 */
public class TestAop
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				LoginControllerTest.classPath);

		IBaseBusiness business = (IBaseBusiness) context
				.getBean("businessProxy");
		// business.delete("猫");
		business.add("猫");
		// business.modify("猫");

		// AspectBusiness aspectBusiness = (AspectBusiness) context
		// .getBean("aspectBusiness");
		// aspectBusiness.delete("狗+++++");
	}

}
