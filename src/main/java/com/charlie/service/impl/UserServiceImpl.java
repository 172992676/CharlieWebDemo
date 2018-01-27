package com.charlie.service.impl;

import com.charlie.entity.User123;
import com.charlie.dao.mapper.User123Mapper;
import com.charlie.entity.User123Example;
import com.charlie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private User123Mapper user123Mapper;

    public List<User123> getUsers(Integer userId) {
        User123Example example = new User123Example();
        User123Example.Criteria criteria = example.createCriteria();
        if (!"".equals(userId == null ? "" : userId)) {
            criteria.andIdEqualTo(userId);
        }
        return user123Mapper.selectByExample(example);

    }
}