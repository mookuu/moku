## dependencyManagement和dependencies

### dependencyManagement

dependencyManagement在父子层级模块关系中，可以进行版本的管理和相关依赖库的管理；  
如果在dependencyManagement标签里面声明了对应的依赖库和版本，那么子模块继承父模块，引入依赖库不需要显式的声明版本就可以用；  
如果子模块引入的依赖库需要版本不同，也可以声明自己的版本。

#### 样例

1. 如下父模块dependencyManagement管理mysql驱动版本依赖库：

    ```yaml
    <dependencyManagement>
        <dependencies>            
            <dependency>
                <groupId>org.testcontainers</groupId>
                <artifactId>mysql</artifactId>
                <version>1.15.1</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
    ```

2. 子模块要用到mysql驱动，可以直接如下声明引入依赖库：

    ```yaml
    <dependencies>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>mysql</artifactId>
        </dependency>
    </dependencies>
    ```

3. 版本管理

    1. 如果子模块需要自己的版本，直接在声明中加入自己的版本号就可以；
    2. 如果是多个模块需要统一升级或修改版本，则只需要改父模块pom文件中dependencyManagement管理的版本；这样就达到了依赖库版本统一管理！
    
### dependencies

dependencies在父子层级模块中，如果在父模块声明了依赖库，则子模块不需要再次声明就可以直接引用了。  
一般我们公用的依赖库都写在父模块pom文件中的dependencies标签里，子模块继承父模块后就会自动引入；  
如果子模块也声明了，根据强龙不压地头蛇，以子模块为准，需要注意的是版本号一定得写！

### Maven打包插件

区别|maven-jar-plugin|spring-boot-maven-plugin
---|---|---
依赖库|不打包进jar|打包进jar
运行|打包的jar需要和lib放在同一目录才能运行|无需考虑lib依赖，打包后直接java -jar运行
大小|jar包小|jar包大
