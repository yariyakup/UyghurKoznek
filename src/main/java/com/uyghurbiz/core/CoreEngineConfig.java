package com.uyghurbiz.core;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Core Engine Configuration for the entire application
 * <p/>
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("coreConfig")
@Import({RepositoryConfig.class, TwitterServiceConfig.class, SpringMongoConfig.class})
@ComponentScan("com.uyghurbiz.controller")
@EnableSwagger2
public class CoreEngineConfig {


    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setLocation(new ClassPathResource("Api.properties"));
        return c;
    }

    @Bean
    public Gson gson() {
        Gson gson = new Gson();
        return gson;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Twitter Rest API For Personal and Learning Only",
                "Please dont hack, and use with Ethic",
                "0.0.1",
                "Terms of service",
                "yariyakup@gmail.com",
                "License of API",
                "http://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
