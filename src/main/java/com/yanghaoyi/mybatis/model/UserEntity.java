package com.yanghaoyi.mybatis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YangHaoYi on 2020/4/24.
 * Email  :  yang.haoyi@qq.com
 * Description :用户数据Bean
 * Change : YangHaoYi on 2020/4/24.
 * Version : V 1.0
 */
@Data
public class UserEntity implements Serializable {
    private Integer id;
    private String token;
    private String userName;
    private String password;
}
