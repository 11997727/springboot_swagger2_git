package com.example.springboot_swagger2.service.impl;

import com.example.springboot_swagger2.mapper.UserMapper;
import com.example.springboot_swagger2.model.User;
import com.example.springboot_swagger2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_swagger2
 * @Package com.example.springboot_swagger2.service.impl
 * @Description:
 * @date 2020/1/6 星期一 17:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User queryAccountAndPassword(String account, String password) {
        return userMapper.selectUserByAccountAndPassword(account,password);
    }
}
