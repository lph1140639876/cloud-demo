package com.lph;

import org.springframework.cloud.netflix.eureka.server.*;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {



    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
