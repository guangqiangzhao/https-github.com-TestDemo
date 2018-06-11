package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private static Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping("/add")
	
	public String  addUser() {
		User u = new User("zhangsan", "lisi",24);
		log.info("创建用户成功 ");
		
		return "success";
	}
}
