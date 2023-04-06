package com.land.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.land.template.mapper")
@EnableCaching(proxyTargetClass = true)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({ "com.land.template.controller", "com.land.base" })
public class LandApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandApplication.class, args);
	}

}
