package utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 绑定NOP无操作，丢弃所有的日志。
 * 执行时应将类路径中的所有绑定的日志框架移除掉
 *
 * @author kan
 */
public class Slf4jNoFramework {
    final Logger logger = LoggerFactory.getLogger(Slf4jNoFramework.class);
    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if (temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }
}
