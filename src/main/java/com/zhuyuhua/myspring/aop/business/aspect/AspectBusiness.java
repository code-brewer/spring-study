/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.aop.aspectj 
 * @FileName:AspectBusiness.java 
 * @Date:2014-1-24 上午11:22:44 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.aop.business.aspect;


/**
 * @ClassName:AspectBusiness
 * @Desc:业务类
 * @Author:joe
 * @Date:2014-1-24 上午11:22:44
 * @Since:V 1.0
 */
public class AspectBusiness
{
	/**
	 * 切入点
	 */
	public String delete(String obj) {
		System.out.println("==========调用切入点：" + obj + "说：你敢删除我！===========\n");
		return obj + "：瞄～";
	}

	public String add(String obj) {
		System.out.println("================这个方法不能被切。。。============== \n");
		return obj + "：瞄～ 嘿嘿！";
	}

	public String modify(String obj) {
		System.out.println("=================这个也设置加入切吧====================\n");
		return obj + "：瞄改瞄啊！";
	}
}
