package org.lesson1.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationProperties {

    @Value("${app.properties}")
    private String valueApp;

    @Bean
    public AppProperties getAppProperties() {
        System.out.println("init AppProperties");
        return new AppProperties(valueApp);
    }
}
