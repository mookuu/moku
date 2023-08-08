package utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kan
 */
public class Slf4jLogbackFramework {

    Integer t;
    Integer oldT;
    final Logger logger = LoggerFactory.getLogger(Slf4jLogbackFramework.class);

    public void setTemperature(Integer temperature) {

        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
        if (temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }
}
