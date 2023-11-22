package com.jiav.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.jiav.springcloud.alibaba.dao"})
public class MyBatisConfig {
}