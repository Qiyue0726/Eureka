package org.sakura.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yujianhao
 * @ClassName: HelloController
 * @Description: 描述
 * @CreateDate: 2019-08-27 22:20
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.helloService(name);
    }
}
