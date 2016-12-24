package com.aladdin.realestate.commons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aladdin.realestate.commons.dao.UserDao;
import com.aladdin.realestate.commons.domain.User;

@Service  
public class UserServiceImpl implements UserService {
	
	User user;
	
    @Autowired  
    private UserDao userDao;  

	public User selectUserById(Integer userId) {
		System.out.println("123");
		
        user = userDao.selectUserById(1);  
        System.out.println(user.getUserPassword());
        return user;
    }  
}
