package utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kan
 * 绑定简单实现（的日志框架），将所有的事件输出到System.err。
 * 只有INFO级别以上的消息才被打印。
 */
public class Slf4jSimpleFramework {
    final Logger logger = LoggerFactory.getLogger(Slf4jSimpleFramework.class);
    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if(temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }

}
