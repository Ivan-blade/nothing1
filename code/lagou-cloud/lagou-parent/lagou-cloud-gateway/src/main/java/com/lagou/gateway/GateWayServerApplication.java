package com.lagou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author apple
 * @date 2021/1/28 下午7:58
 * @description
 */

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(GateWayServerApplication.class,args);
    }
}
