package com.moku.producer.web.service;

import com.moku.producer.web.Blog;
import com.moku.producer.web.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName Service1
 * @Description
 * @Author moku
 * @Date 2023/4/25 23:25
 * @Version 1.0
 */
@Service
public class Service1 {

    @Autowired
    Book book;
    @Autowired
    Blog blog;

    public void printProperties() {
        System.out.println("Book Description:" + book.getDesc());
        System.out.println("Blog:" + blog.getBigNumber() + ", " + blog.getRandomIntLimit() + ", " + blog.getRandomIntBetween());
    }
}
