## SpringBoot属性加载机制

以下顺序由高到低加载，数字越小优先级越高

1. 命令行中传入的参数
2. SPRING_APPLICATION_JSON中的属性，以JSON格式配置在系统环境变量中的内容
3. java:comp/env中的JNDI属性
4. Java的系统属性，可以通过System.getProperties()获取
5. 操作系统的环境变量
6. 通过random.*配置的随机属性
7. 位于当前应用jar包之外，针对不同{profile}环境的配置文件内容
    如application-{profile}.properties或是YAML定义的配置文件
8. 位于当前应用jar包之内，针对不同{profile}环境的配置文件内容
   如application-{profile}.properties或是YAML定义的配置文件
9. 位于当前应用jar包之外的application.properties和YAML配置内容   
10. 位于当前应用jar包之内的application.properties和YAML配置内容
11. @Configuration注解修改的类中，通过@PropertySource注解定义的属性
12. 应用默认属性，使用SpringApplication.setDefaultProperties定义的内容