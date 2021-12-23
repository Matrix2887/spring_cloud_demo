package cloud.controller;



import cloud.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConsumerController {



    @Autowired
    private HelloRemote helloRemote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String hello = helloRemote.hello(name);
        hello += " is consumer";
        return hello;
    }


    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        String hi = helloRemote.hi(name);
        hi += " is consumer";
        return hi;
    }

}