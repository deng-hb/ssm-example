package com.denghb.ssm.service;

import com.denghb.ssm.model.User;

import java.util.List;


/**
 * Created by denghb on 16/9/7.
 */
public interface UserService {

    void create(User user);

    User query(Integer id);

    List<User> list();

    void update(User user);

    void delete(Integer id);
}
