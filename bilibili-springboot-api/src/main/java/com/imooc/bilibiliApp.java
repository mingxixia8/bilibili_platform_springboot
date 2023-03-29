package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  //标明这是一个springboot项目
public class bilibiliApp {
    public static void main(String[] args) {
        //启动Spring项目
        ApplicationContext app = SpringApplication.run(bilibiliApp.class,args);
    }

}
