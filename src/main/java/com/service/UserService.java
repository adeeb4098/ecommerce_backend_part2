package com.service;

import com.Exception.UserException;
import com.model.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;

}
