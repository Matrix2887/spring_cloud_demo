package cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controllers {

//    @HystrixCommand(fallbackMethod = "errMethod",ignoreExceptions = {ParamErrorException.class, BusinessTypeException.class})
    @RequestMapping(value = "/incaseoffailureusethis")
    public Map<String, String> fallBackController() {


        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "service not available");
        return res;
    }


    @RestController
    public class DefaultHystrixController{
        @RequestMapping(value = "/fallback",method = RequestMethod.GET)
        public String fallback(){
            System.out.println("fallback****************Gateway");
            return "welcome to fallback";
        }
    }

}
