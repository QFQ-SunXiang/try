package com.aladdin.realestate.commons.service;

import com.aladdin.realestate.commons.domain.User;

public interface UserService {
    User selectUserById(Integer userId);  
}
