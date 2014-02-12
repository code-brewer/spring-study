/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.aop 
 * @FileName:BaseAfterReturnAdvice.java 
 * @Date:2014-1-24 上午9:32:41 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/** 
 * @ClassName:BaseAfterReturnAdvice 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-24 上午9:32:41 
 * @Since:V 1.0 
 */
public class BaseAfterReturnAdvice implements AfterReturningAdvice
{

	/* (non-Javadoc) 
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object) 
	 */
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out
				.println("========进入BaseAfterReturnAdvice.afterReturning()=========");
		System.out.print(args[0] + "在");
		System.out.print(target + "对象上被");
		System.out.print(method + "方法删除了");
		System.out.print("只留下：" + returnValue + "\n");
		System.out
				.println("========退出BaseAfterReturnAdvice.afterReturning()=========");
	}
}
