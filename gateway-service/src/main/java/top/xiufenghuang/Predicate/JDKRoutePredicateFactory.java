package top.xiufenghuang.Predicate;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/10/18 15:39
 */


import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


/**
 * @author mqxu
 * @date 2024/10/18
 * @description JDKRoutePredicateFactory
 **/
@Component
public class JDKRoutePredicateFactory extends AbstractRoutePredicateFactory<JDKRoutePredicateFactory.Config> {
    public static final String VERSION = "version";

    public JDKRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(VERSION);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return new GatewayPredicate() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                String version = System.getProperty("java.version");
                return StringUtils.isNotBlank(version) & version.startsWith(config.getVersion());
            }

            @Override
            public Object getConfig() {
                return config;
            }

            @Override
            public String toString() {
                return String.format("JDK Version: %s", config.getVersion());
            }
        };
    }

    @Data
    @NoArgsConstructor
    public static class Config {
        @NotNull
        private String version;
    }

}
