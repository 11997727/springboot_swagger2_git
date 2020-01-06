package com.example.springboot_swagger2.mapper;

import com.example.springboot_swagger2.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_swagger2
 * @Package com.example.springboot_swagger2.mapper
 * @Description:
 * @date 2020/1/6 星期一 16:56
 */
@Mapper
public interface UserMapper {

    User selectUserByAccountAndPassword(@Param("account") String account, @Param("password") String password);
}
