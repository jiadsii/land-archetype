package com.land.template.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LZJ
 * @time 2023-03-22 14:35:46
 **/
@Data
@Slf4j
@RestController
@NoArgsConstructor
public class DemoController {

    /**
     * 健康检查
     */
    @RequestMapping("/demoController")
    public ResponseEntity<String> welcome() {
        log.info("==== [log]: {}");
        return ResponseEntity.ok("pong");
    }

}
