package org.sakura.client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yujianhao
 * @ClassName: HelloController
 * @Description: 描述
 * @CreateDate: 2019-08-27 22:02
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = true,name = "name") String name){
        return "Hello " + name + ", 8082";
    }
}
