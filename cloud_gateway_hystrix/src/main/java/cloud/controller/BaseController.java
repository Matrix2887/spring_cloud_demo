package cloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;



//@DefaultProperties(defaultFallback = "defaultFallback", ignoreExceptions = {
//        BusinessException.class }, commandProperties = {}, groupKey = "组名", threadPoolKey = "线程池名")
@ResponseBody
public abstract class BaseController {

    @Value("${isDevMode:true}")
    private boolean isDevMode;


    protected ResponseEntity<Object> defaultFallback(Throwable e) {
        String devPrefix = "CircuitBreaker triggered:\r\n";
        String message = "系统繁忙，请稍后再试.";
        System.err.println(Thread.currentThread().getName());
        return ResponseEntity.badRequest().body(message);
    }
}


