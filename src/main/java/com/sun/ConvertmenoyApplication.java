package com.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sun.convert.mapper")
public class ConvertmenoyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConvertmenoyApplication.class, args);
    }
}
