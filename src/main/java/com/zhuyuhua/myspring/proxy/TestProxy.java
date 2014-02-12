/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.proxy 
 * @FileName:TestProxy.java 
 * @Date:2014-1-21 下午3:06:43 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/** 
 * @ClassName:TestProxy 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-21 下午3:06:43 
 * @Since:V 1.0 
 */
public class TestProxy
{
	public static void main(String[] args) {
		BookFacadeImpl facade = new BookFacadeImpl();
		Class<?>[] classz = facade.getClass().getInterfaces();
		for (Class<?> class1 : classz) {
			System.err.println(class1.getName() + ","
					+ class1.getCanonicalName());
		}
		BookFacade facade1 = (BookFacade) new BookFacadeProxy()
				.bind(new BookFacadeImpl());
		facade1.addBook();

	}
}

interface BookFacade
{
	public int a = 100;
	public void addBook();
}

class BookFacadeImpl implements BookFacade
{
	private int a;

	public void addBook() {
		System.out.println("增加图书");
	}

}

class BookFacadeProxy implements InvocationHandler
{

	private Object target;

	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("事物开始");
		// 执行方法
		result = method.invoke(target, args);
		System.out.println("事物结束");
		return result;
	}

}