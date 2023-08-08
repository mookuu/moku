## SpringBoot Junit

### 概述

* Junit 5 = Junit Platform + Junit Jupiter + Junit Vintage

* Junit Platform: Junit Platform是在JVM上启动测试框架的基础，不仅支持Junit自制的测试引擎，其他测试引擎也都可以接入。

* Junit Jupiter: Junit Jupiter提供了JUnit5的新的编程模型，是JUnit5新特性的核心。内部 包含了一个测试引擎，用于在Junit Platform上运行。

* Junit Vintage: 由于JUnit已经发展多年，为了照顾老的项目，JUnit Vintage提供了兼容JUnit4.x,Junit3.x的测试引擎。

## Junit4和Junit5区别

Junit5|Junit4|说明
---|---|---
@Test|@Test|被注解的方法是一个测试方法。与 JUnit 4 相同。
@BeforeAll|@BeforeClass|被注解的（静态）方法将在当前类中的所有 @Test 方法前执行一次。
@BeforeEach|@Before|被注解的方法将在当前类中的每个 @Test 方法前执行。
@AfterEach|@After|被注解的方法将在当前类中的每个 @Test 方法后执行。
@AfterAll|@AfterClass|被注解的（静态）方法将在当前类中的所有 @Test 方法后执行一次。
@Disabled|@Ignore|被注解的方法不会执行（将被跳过），但会报告为已执行
