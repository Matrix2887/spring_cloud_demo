package com.cloud;


import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

/**
 * @e-mail  gundam1729@gmail.com
 * @date    2021-12-23
 */

@SpringBootApplication
//@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableTurbine  // 开启Turbine聚合功能
public class TurbineApplication {
    public static void main(String[] args) {
        // http://localhost:8023/turbine.stream
        SpringApplication.run(TurbineApplication.class,args);
    }

}
