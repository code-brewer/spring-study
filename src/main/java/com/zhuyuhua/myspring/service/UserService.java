/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.service 
 * @FileName:UserService.java 
 * @Date:2014-1-14 下午5:38:32 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.service;

import com.zhuyuhua.myspring.model.User;

/**
 * @ClassName:UserService
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-14 下午5:38:32
 * @Since:V 1.0
 */
public interface UserService {

	public void addUser(User user);

	public void callUser();
}
