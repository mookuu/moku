package com.moku.springbootbasic.mq.metircs;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @ClassName RocketMQHealthIndicator
 * @Description
 * @Author moku
 * @Date 2023/4/27 0:08
 * @Version 1.0
 */
@Component
public class RocketMQHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode != 0) {
            return Health.down().withDetail("Erro Code", errorCode).build();
        }
        return Health.up().build();
    }

    private int check() {
        // 对监控对象的检测操作
        return 0;
    }
}
