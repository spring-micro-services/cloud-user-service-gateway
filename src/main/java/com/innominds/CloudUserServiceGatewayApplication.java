package com.innominds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient // to register with eureka
@SpringBootApplication
public class CloudUserServiceGatewayApplication {

    public static void main( String[] args ) {
        SpringApplication.run( CloudUserServiceGatewayApplication.class, args );
    }
}
