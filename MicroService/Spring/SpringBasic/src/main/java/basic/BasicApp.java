package basic;

import basic.config.KnightConfig;
import basic.knights.interfaces.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BasicApp
 *
 * @author moku
 * @date 2023/5/17 0:23:49
 * @version 1.0
 */
public class BasicApp {
    public static void main(String[] args) {
        // 通过配置文件加载Spring上下文
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

        // 通过配置类加载Spring上下文
        ApplicationContext context2 = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight2 = context2.getBean(Knight.class);
        knight2.embarkOnQuest();
    }
}
