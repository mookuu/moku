package com.moku.springbootbasic.web;

import com.moku.springbootbasic.SpringBootBasicApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @ClassName HelloControllerTest
 * @Description
 * @Author moku
 * @Date 2023/4/24 23:06
 * @Version 1.0
 */
// 替代@RunWith(SpringJUnit4ClassRunner.class)
// @ExtendWith(SpringExtension.class)
// 复合注解
@SpringBootTest
// 开启Web应用的配置，用于模拟ServletContext
//@WebAppConfiguration
public class HelloControllerTest {

    private MockMvc mvc;

    // Junit中定义在测试用例@Test执行前预加载的内容，此处用于初始化对HelloController的模拟
    @BeforeEach
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hello() throws Exception {
        // 模拟调用Controller的接口发起请求
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World!")));
    }
}
