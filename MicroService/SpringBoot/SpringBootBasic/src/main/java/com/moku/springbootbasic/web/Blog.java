package com.moku.springbootbasic.web;

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

    @Value("${com.moku.springbootbasic.blog.bigNumber}")
    private long bigNumber;
    @Value("${com.moku.springbootbasic.blog.randomNumberIn10}")
    private int randomIntLimit;
    @Value("${com.moku.springbootbasic.blog.randomNumberBetween10And20}")
    private int randomIntBetween;
}
