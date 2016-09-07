package com.denghb.ssm.service.impl;

import com.denghb.ssm.mapper.UserMapper;
import com.denghb.ssm.model.User;
import com.denghb.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by denghb on 16/9/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(User user) {
        user.setCreatedBy(0);
        userMapper.insertSelective(user);
    }

    @Override
    public User query(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
