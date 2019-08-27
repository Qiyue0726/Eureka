package org.sakura.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yujianhao
 * @ClassName: IFeignService
 * @Description: 描述
 * @CreateDate: 2019-08-27 23:14
 */

@FeignClient(value = "client")  //value值为需要调用的服务名
public interface IFeignService {

    @GetMapping("/hello")   //这里的地址为需要调用的服务里相应的接口地址
    String hello(@RequestParam(value = "name")String name);
}
