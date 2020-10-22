package com.xiaohu.warehouse.dtwarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.xiaohu.*")
public class DtwarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtwarehouseApplication.class, args);
    }

}
