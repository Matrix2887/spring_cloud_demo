package cloud;


import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @e-mail  gundam1729@gmail.com
 * @date    2021-12-23
 */


@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableHystrixDashboard
public class DashboardApplication {

    public static void main(String[] args) {
        //http://localhost:8022/actuator/hystrix.stream
        SpringApplication.run(DashboardApplication.class, args);
    }

    //在主启动类中指定监控路径
    //http://localhost:8022/hystrix.stream
//    @Bean
//    public ServletRegistrationBean getServlet() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//
//        return registrationBean;
//    }
}
