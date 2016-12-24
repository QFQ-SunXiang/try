package com.aladdin.realestate.web.controller;

import java.util.Map;

//import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aladdin.realestate.commons.domain.*;
//import com.aladdin.realestate.commons.service.UserService;

@Controller  
public class UserController {  



/*	@Resource  
    private UserService userService;*/  

    
	@RequestMapping("/User.do") 
    public String login(Map<String,Object> map)
    {
    	User user = new User();
    	System.out.println("123");
    	user.setUserId(1);
    	
//    	user = userService.selectUserById(1);
    	map.put("user", user);
    	return"index";
    }


//	public UserService getUserService() {
//		return userService;
//	}
//
//
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
}  