package com.example.springboot_swagger2.service;

import com.example.springboot_swagger2.model.User;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_swagger2
 * @Package com.example.springboot_swagger2.service
 * @Description:
 * @date 2020/1/6 星期一 16:59
 */
public interface UserService {

    User queryAccountAndPassword(String account, String password);
}
