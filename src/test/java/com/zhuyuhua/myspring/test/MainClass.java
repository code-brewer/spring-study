/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.test 
 * @FileName:CallBack.java 
 * @Date:2014-1-16 下午2:06:54 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.test;





/** 
 * @ClassName:CallBack 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-16 下午2:06:54 
 * @Since:V 1.0 
 */
public class MainClass
{
	public static void main(String[] args) {
		Caller caller = new Caller();
		caller.setCallback(new ClassWithCallbackFunction()
		{
			@Override
			public void func() {
				System.out.println("==main ClassWithCallbackFunction===");
				System.out.println(this.toString());
				System.out.println(super.toString());
				super.func();
			}

		});
		caller.doCallback();
	}
}

class Caller
{
	private ICallback callback;

	public void setCallback(ICallback callback) {
		this.callback = callback;
	}

	public void doCallback() {
		System.out.println("===Call doCallback===");
		callback.func();
	}
}

interface ICallback
{
	public void func();
}

class ClassWithCallbackFunction implements ICallback
{
	public ClassWithCallbackFunction() {
		System.out.println("===构造函数===");
	}
	public void func() {
		System.out.println("==ClassWithCallbackFunction func==");
	}

}
