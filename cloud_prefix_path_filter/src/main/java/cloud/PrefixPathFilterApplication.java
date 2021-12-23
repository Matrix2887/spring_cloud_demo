package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @e-mail  gundam1729@gmail.com
 * @date    2021-12-23
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PrefixPathFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrefixPathFilterApplication.class,args);
    }

}
