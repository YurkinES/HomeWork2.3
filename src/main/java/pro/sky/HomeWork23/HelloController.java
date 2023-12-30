package pro.sky.HomeWork23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(path = "/calculator")
    public String hello(){
        return helloService.helloAnswer();
    }
    }


