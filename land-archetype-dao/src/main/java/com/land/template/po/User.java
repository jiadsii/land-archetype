package com.land.template.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.land.base.po.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
*  用户表
* @author LZJ 2021-02-03
*/
@Data
@TableName("t_gk_daily_user_d")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1887364L;

    /**
    * 姓名
    */
    private String name;

    /**
    * 姓名
    */
    private String loginName;

    /**
    * 性别
    */
    private boolean gender;

    /**
     * 钉钉id
     */
    String ddUnionId;

    /**
     * 电话号码
     */
    String phone;


}
