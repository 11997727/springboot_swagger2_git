package com.example.springboot_swagger2.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot_swagger2.model.Result;
import com.example.springboot_swagger2.model.User;
import com.example.springboot_swagger2.service.UserService;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_swagger2
 * @Package com.example.springboot_swagger2.controller
 * @Description:
 * @date 2020/1/6 星期一 17:01
 */
@Controller
@Api(tags="这是吴成卓写的类")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "输入账号密码验证登录信息",notes = "正确返回用户信息，错误返回错误码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account",value = "账号",dataType = "String",example = "admin"),
            @ApiImplicitParam(name="password",value = "密码",type = "String",example = "123456")
    })
    @ApiResponses({
            @ApiResponse(code = 4,message = "failed"),
            @ApiResponse(code = 0,message = "success")
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(String account,String password){
        User user = userService.queryAccountAndPassword(account, password);
        Result result = new Result();
        if(user==null){
            result.setCode(4);
            result.setMsg("failed");
        }else{
            result.setCode(0);
            result.setMsg("success");
            result.setData(JSON.toJSONString(user));
        }
        return result;
    }
}
