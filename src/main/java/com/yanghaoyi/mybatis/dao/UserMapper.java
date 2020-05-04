package com.yanghaoyi.mybatis.dao;



import com.yanghaoyi.mybatis.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : YangHaoYi on 2020/4/24.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2020/4/24.
 * Version : V 1.0
 */
@Mapper
public interface UserMapper {

    /** 插入用户 */
    int insertUser(UserEntity userEntity);

    /** 通过用户名查找用户 */
    UserEntity findUserByUserName(String userName);

    /** 通过用户Id查找用户 */
    UserEntity findUserById(int id);

}
