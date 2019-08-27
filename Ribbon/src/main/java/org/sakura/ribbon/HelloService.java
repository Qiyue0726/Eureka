package org.sakura.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yujianhao
 * @ClassName: HelloService
 * @Description: 描述
 * @CreateDate: 2019-08-27 22:20
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name){
        return restTemplate.getForObject("http://client/hello?name="+name,String.class);
    }
}
