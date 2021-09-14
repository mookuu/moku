package utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kan
 */
public class Slf4jLog4jFramework {
    // application
    //   -> SLF4JAPI(slf4j-api.jar):abstract logging api
    //   -> Adaptation layer(slf4j-log412.jar):适应层控制器(适配器)
    //   -> Underlying logging framework(log4j.jar):非原生实现
    // native implementation：原生实现

    final Logger logger = LoggerFactory.getLogger(Slf4jLog4jFramework.class);
//    private final static org.slf4j.Logger logger2 = LoggerFactory.getLogger(Slf4jNoFramework.class);

    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

//        logger2.error("test");

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if (temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }
}
