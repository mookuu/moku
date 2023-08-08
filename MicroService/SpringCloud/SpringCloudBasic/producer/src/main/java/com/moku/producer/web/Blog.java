package com.moku.producer.web;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Blog
 * @Description
 * @Author moku
 * @Date 2023/4/25 23:11
 * @Version 1.0
 */
@Component
@Data
public class Blog {

    @Value("${com.moku.producer.blog.bigNumber}")
    private long bigNumber;
    @Value("${com.moku.producer.blog.randomNumberIn10}")
    private int randomIntLimit;
    @Value("${com.moku.producer.blog.randomNumberBetween10And20}")
    private int randomIntBetween;
}
