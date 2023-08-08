package com.moku.producer.web;

import com.moku.producer.web.service.Service1;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @ClassName HelloController
 * @Description
 * @Author moku
 * @Date 2023/4/24 22:36
 * @Version 1.0
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    // Autowired可能无法注入第三方类(第三方类未用Component)
//    @Autowired
    @Resource
    private DiscoveryClient client;

    @Autowired
    Service1 service1;

    // TODO：实现自定义统计指标信息
//    @Autowired
////    private CounterService counterService;
//    @Autowired
//    private GaugeService gaugeService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        service1.printProperties();
        // TODO：实现自定义统计指标信息
//        counterService.increment("producer.hello.count");

        List<String> services = client.getServices();
        for (String service : services) {
            logger.info("service=" + service);
        }

        List<ServiceInstance> instances = client.getInstances("hello-service");
        for (ServiceInstance instance : instances) {
            StringBuilder sb = new StringBuilder();
            sb.append(instance.getServiceId()).append(", ")
                    .append(instance.getHost()).append(", ")
                    .append(instance.getPort()).append(", ")
                    .append(instance.getUri());
            logger.info("instance=" + sb);
        }
        return "Hello World!";
    }
}
