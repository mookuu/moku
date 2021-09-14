package utils.logger;


public class Slf4jNoFrameworkTest {

    public static void main(String[] args) {

        // slf4j不绑定实现
        // 执行时应将类路径中的所有绑定的日志框架移除掉
        Slf4jNoFramework slf4jNoFramework = new Slf4jNoFramework();
        slf4jNoFramework.setTemperature(60);
    }
}
