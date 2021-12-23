package cloud.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge ,from producer 成功 提供";
    }

    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "hi "+name+"，this is first messge ,from producer 成功 提供";
    }


    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }
}