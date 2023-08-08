package com.moku.springbootbasic.web;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Book
 * @Description
 * @Author moku
 * @Date 2023/4/25 22:50
 * @Version 1.0
 */
@Component
@Data
public class Book {

    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
    @Value("${book.desc}")
    private String desc;
}
