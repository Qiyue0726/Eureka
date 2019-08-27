package org.sakura.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yujianhao
 * @ClassName: HelloController
 * @Description: 描述
 * @CreateDate: 2019-08-27 23:22
 */
@RestController
public class HelloController {

    @Autowired
    private IFeignService iFeignService;

    @GetMapping("/feign/hello")
    public String sayHello(String name){
        return iFeignService.hello(name);
    }
}
