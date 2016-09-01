package com.uyghurbiz.core;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;


/**
 * Core Engine Configuration for the entire application
 * <p/>
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("coreConfig")
@Import({RepositoryConfig.class, TwitterServiceConfig.class})
public class CoreEngineConfig {


    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setLocation(new ClassPathResource("api.properties"));
        return c;
    }
    @Bean
    public Gson gson() {
        Gson gson = new Gson();
        return gson;
    }
}
