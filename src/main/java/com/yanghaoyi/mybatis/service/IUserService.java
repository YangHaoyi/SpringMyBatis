package com.yanghaoyi.mybatis.service;


import com.yanghaoyi.mybatis.model.UserEntity;

/**
 * @author : YangHaoYi on 2020/4/24.
 * Email  :  yang.haoyi@qq.com
 * Description : 服务接口
 * Change : YangHaoYi on 2020/4/24.
 * Version : V 1.0
 */
public interface IUserService {

    /** 插入用户 */
    UserEntity insertUser(String userName, String password);

    /** 通过用户名查找用户 */
    UserEntity findUserByUserName(String userName);

    /** 通过用户Id查找用户 */
    UserEntity findUserById(int id);
}
