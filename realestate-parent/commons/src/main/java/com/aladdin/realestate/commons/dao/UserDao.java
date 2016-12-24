package com.aladdin.realestate.commons.dao;

import com.aladdin.realestate.commons.domain.User;

public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  

}
