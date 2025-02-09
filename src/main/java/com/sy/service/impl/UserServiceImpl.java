package com.sy.service.impl;

import com.sy.entity.User;
import com.sy.mapper.UserMapper;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}