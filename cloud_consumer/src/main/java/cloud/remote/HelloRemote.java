package cloud.remote;

import cloud.hystrix.HelloRemoteHystrix;
import cloud.hystrix.HelloRemoteHystrixFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2018/5/11.
 */
//name:远程服务名，及spring.application.name配置的名称
@Primary
@FeignClient(value  = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
//@FeignClient(value  = "spring-cloud-producer",fallbackFactory = HelloRemoteHystrixFactory.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
