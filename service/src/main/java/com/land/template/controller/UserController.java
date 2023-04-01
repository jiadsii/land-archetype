package com.land.template.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.land.template.mapper.UserMapper;
import com.land.template.po.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LZJ
 * @time 2023-04-01 13:43:19
 **/
@Slf4j
@RestController("user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    /**
     * query user
     */
    @RequestMapping("/query")
    public ResponseEntity<List<User>> query() {
        List<User> userList = userMapper.selectList(null);
        log.info("==== [log]: {}", JSON.toJSONString(userList, SerializerFeature.PrettyFormat));
        return ResponseEntity.ok(userList);
    }

}
