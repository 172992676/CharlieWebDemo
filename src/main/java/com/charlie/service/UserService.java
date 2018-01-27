package com.charlie.service;

import com.charlie.entity.User123;

import java.util.List;

public interface UserService {

    List<User123> getUsers(Integer userId);
}