package com.yanghaoyi.mybatis.service.impl;


import com.yanghaoyi.mybatis.dao.UserMapper;
import com.yanghaoyi.mybatis.model.UserEntity;
import com.yanghaoyi.mybatis.service.IUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author : YangHaoYi on 2020/4/24.
 * Email  :  yang.haoyi@qq.com
 * Description :服务实现
 * Change : YangHaoYi on 2020/4/24.
 * Version : V 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserEntity insertUser(String userName, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        return userEntity;
    }

    @Override
    public UserEntity findUserByUserName(String userName) {
        return userMapper.findUserByUserName(userName);
    }

    @Override
    public UserEntity findUserById(int id) {
        UserEntity userEntity;
        userEntity = userMapper.findUserById(id);
        return userEntity;
    }

}
