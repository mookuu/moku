package basic;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log4j2Test
 *
 * @author moku
 * @date 2023/5/24 1:17:53
 * @version 1.0
 */
public class Log4j2Test {

    public Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        logger.error("COLOR ERROR");
        logger.warn("COLOR WARN");
        logger.info("COLOR INFO");
        logger.debug("COLOR DEBUG");
        logger.trace("COLOR TRACE");
    }
}
