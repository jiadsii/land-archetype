package com.land.template.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.land.template.po.User;

import org.springframework.stereotype.Repository;

/**
* 用户表
* @author LZJ  2023-04-01
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

    public List<User> notFillUserList(int typec);
}
