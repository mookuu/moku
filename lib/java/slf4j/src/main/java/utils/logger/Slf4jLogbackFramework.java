package utils.logger;

/**
 * @author kan
 * requires logback-core-1.0.13.jar
 * 本地实现。有一些在SLF4J工程之外的与SLF4J绑定，例如logback本身就实现了SLF4J。
 * Logback的ch.qos.logback.classic.Logger类是SLF4J的org.slf4j.Logger接口的直接实现。
 * 因此，结合logback使用SLF4J节省很多内存和计算的开销。
 */
public class Slf4jLogbackFramework {
}
