package utils.logger;

/**
 * @author kan
 * 绑定log4j。
 * 需要把log4j.jar包添加到类路径中。
 */
public class Slf4jLog4jFramework {
    // application
    //   -> SLF4JAPI(slf4j-api.jar):abstract logging api
    //   -> Adaptation layer(slf4j-log412.jar):适应层控制器(适配器)
    //   -> Underlying logging framework(log4j.jar):非原生实现
    // native implementation：原生实现
}
