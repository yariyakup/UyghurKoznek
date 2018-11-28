package com.uyghurbiz.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Yari_Dev on 10/13/15.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.uyghurbiz")
public class EngineStart {
    public static void main(String[] args) {
        SpringApplication.run(EngineStart.class, args);

    }
}
