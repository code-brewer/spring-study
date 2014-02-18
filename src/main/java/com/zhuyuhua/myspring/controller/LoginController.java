package com.zhuyuhua.myspring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhuyuhua.myspring.domain.LoginForm;

@Controller
public class LoginController {

	private static final Logger logger = LogManager
			.getLogger(LoginController.class);

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		logger.debug(command);
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("index/index", "command",
				"LOGIN SUCCESS, " + username);
		return mv;
	}

	@RequestMapping(value = "/*")
	public void show() {
		System.out.println("-----show----");
	}
}
