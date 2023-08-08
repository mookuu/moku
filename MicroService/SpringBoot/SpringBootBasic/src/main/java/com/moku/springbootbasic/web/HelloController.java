package com.moku.springbootbasic.web;

import com.moku.springbootbasic.web.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author moku
 * @Date 2023/4/24 22:36
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    Service1 service1;

    // TODO：实现自定义统计指标信息
//    @Autowired
////    private CounterService counterService;
//    @Autowired
//    private GaugeService gaugeService;

    @RequestMapping("/hello")
    public String index() {
        service1.printProperties();
        // TODO：实现自定义统计指标信息
//        counterService.increment("springbootbasic.hello.count");
        return "Hello World!";
    }
}
