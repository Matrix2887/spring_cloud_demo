package cloud.hystrix;

import cloud.remote.HelloRemote;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrixFactory implements FallbackFactory<HelloRemote> {
    @Override
    public HelloRemote create(Throwable cause) {
        // 与fallback的方式类似 需要返回一个对应接口的对象
        return new HelloRemote() {
            @Override
            public String hello(String name) {
                return "hello " +name+", this message send failed 失败 降级 工厂 ";
            }

            @Override
            public String hi(String name) {
                return "hi " +name+", this message send failed 失败 降级 工厂 ";
            }
        };
    }
}
