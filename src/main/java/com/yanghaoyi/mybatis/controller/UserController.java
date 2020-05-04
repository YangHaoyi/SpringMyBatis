package com.yanghaoyi.mybatis.controller;

import com.yanghaoyi.mybatis.model.UserEntity;
import com.yanghaoyi.mybatis.service.IUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : YangHaoYi on 2020/4/24.
 * Email  :  yang.haoyi@qq.com
 * Description :用户服务控制层
 *              运行网址：http://localhost:6061/api/v1/user/info
 * Change : YangHaoYi on 2020/4/24.
 * Version : V 1.0
 */
@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public UserEntity getUserInfo() {
        UserEntity userEntity =  userService.findUserById(0);
        return userEntity;
    }

}
