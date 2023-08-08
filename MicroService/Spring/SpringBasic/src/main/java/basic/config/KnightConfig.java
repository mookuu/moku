package basic.config;

import basic.knights.interfaces.Knight;
import basic.knights.interfaces.Quest;
import basic.knights.logic.BraveKnight;
import basic.knights.logic.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * KnightConfig
 *
 * @author moku
 * @date 2023/5/18 23:21:56
 * @version 1.0
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
