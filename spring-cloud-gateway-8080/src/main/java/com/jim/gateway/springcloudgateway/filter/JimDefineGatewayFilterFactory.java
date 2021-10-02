package com.jim.gateway.springcloudgateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

//@Order(value = 1)
@Component
public class JimDefineGatewayFilterFactory extends AbstractGatewayFilterFactory<JimDefineGatewayFilterFactory.JimDefineConfig> {

    Logger logger = LoggerFactory.getLogger(JimDefineGatewayFilterFactory.class);

    private static final String NAME_KEY="name";

    public JimDefineGatewayFilterFactory() {
        super(JimDefineConfig.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY);
    }

    @Override
    public GatewayFilter apply(JimDefineConfig config) {
        return ((exchange, chain) -> {
            logger.info("[pre] Filter Request, name:"+config.getName());
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                //TODO
                logger.info("[post]: Response Filter");
            }));
        });
    }

    public static class JimDefineConfig {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
