package cloud.hystrix;

import cloud.remote.HelloRemote;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this message send failed 失败 降级 ";
    }

    @Override
    public String hi(String name) {
        return "hi " +name+", this message send failed 失败 降级 ";
    }
}