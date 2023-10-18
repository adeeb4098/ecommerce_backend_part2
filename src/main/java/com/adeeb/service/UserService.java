package com.adeeb.service;

import com.adeeb.Exception.UserException;
import com.adeeb.model.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;

}
