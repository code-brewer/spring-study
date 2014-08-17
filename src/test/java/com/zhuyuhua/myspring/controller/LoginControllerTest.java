package com.zhuyuhua.myspring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuyuhua.myspring.aop.business.IBaseBusiness;
import com.zhuyuhua.myspring.aop.business.aspect.AspectBusiness;
import com.zhuyuhua.myspring.core.SpringTransactionalTestCase;
import com.zhuyuhua.myspring.service.LoginService;

public class LoginControllerTest extends SpringTransactionalTestCase {

	private static final Logger logger = LogManager
			.getLogger(LoginControllerTest.class);

	@Autowired
	private LoginService loginService;

	public static String xmlPath = "F:\\eclipse\\java_workspace\\myspring\\src\\test\\resources\\applicationContext-test.xml";

	public static String classPath = "classpath*:springcfg/application*.xml";

	private ApplicationContext context;

	@Test
	public void test() {
		// context = new FileSystemXmlApplicationContext(xmlPath);
		//
		// LoginService service = context.getBean(LoginService.class);
		// service.showLogin();
		// loginService.showLogin();

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// Resource resource = new
		// ClassPathResource("applicationContext-test.xml");
		// DefaultListableBeanFactory factory = new
		// DefaultListableBeanFactory();
		// XmlBeanDefinitionReader reader = new
		// XmlBeanDefinitionReader(factory);
		// reader.loadBeanDefinitions(resource);
		//
		// LoginService service = (LoginService) factory.getBean("loginS");
		// service.showLogin();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				classPath);

		IBaseBusiness business = (IBaseBusiness) context
				.getBean("businessProxy");
		business.delete("猫");

		AspectBusiness aspectBusiness = (AspectBusiness) context
				.getBean("aspectBusiness");
		aspectBusiness.delete("狗+++++");
		logger.debug("=======");
	}

}
