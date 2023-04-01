package com.land.template.controller;

import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LZJ
 * @time 2023-03-22 14:35:46
 **/
@Slf4j
@RestController
public class DemoController {

    /**
     * 健康检查
     */
    @RequestMapping("/demoController")
    public ResponseEntity<String> welcome() {
        log.info("==== [log]: {}",MDC.get("requestID"));
        return ResponseEntity.ok("just a demo controller changed");
    }

}
