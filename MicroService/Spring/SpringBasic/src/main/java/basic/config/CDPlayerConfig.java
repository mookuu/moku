package basic.config;

import basic.audio.FunctionalInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CDPlayerConfig
 *
 * @author moku
 * @date 2023/5/21 22:54:40
 * @version 1.0
 */
@Configuration
// 组件扫描设置1
//@ComponentScan(value = "basic.audio.imp")
// 组件扫描设置2：类型不安全，重构时指定的基础包可能出错
//@ComponentScan(basePackages = {"basic.audio.imp", "basic.audio.interfaces"})
// 组件扫描设置3：指定类所在的包将会作为组件扫描的基础包，重构时类可能被移除掉
// -> 可通过空标记接口方式保持对重构友好的接口引用
//@ComponentScan(basePackageClasses = {CDPlayer.class, DVDPlayer.class})
@ComponentScan(basePackageClasses = {FunctionalInterface.class})
public class CDPlayerConfig {
}
