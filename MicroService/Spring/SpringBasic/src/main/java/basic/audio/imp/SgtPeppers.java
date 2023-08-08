package basic.audio.imp;

import basic.audio.interfaces.CompactDisc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * SgtPeppers
 *
 * @author moku
 * @date 2023/5/21 22:51:53
 * @version 1.0
 */
@Component("customize-peppers")
//@jakarta.inject.Named("customize-peppers")
//@Named("customize-peppers")
public class SgtPeppers implements CompactDisc {

    final Logger logger = LogManager.getLogger(SgtPeppers.class);

    private String title = "Title";
    private String artist = "Artist";

    @Override
    public void play() {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        // 记录warn级别的信息
        logger.warn("This is warn message.");

        logger.info("customize-peppers bean is loaded");
        System.out.println("Playing " + title + " by " + artist);
    }
}
