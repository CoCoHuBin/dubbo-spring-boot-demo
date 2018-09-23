package com.example.clientdemo;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientDemoApplication {

    @Reference(version = "1.0.0")
    private HelloService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ClientDemoApplication.class, args);
    }

    public String callRemoteService(String str) throws Exception{
        return demoService.sayHello(str);
    }

    @PostConstruct
    public void init() {
        while(true) {
            try {
                String sayHello = callRemoteService("world");
                System.err.println(sayHello);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
