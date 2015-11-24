package com.uyghurbiz.core;


import com.uyghurbiz.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.MongoDbFactory;

/**
 * This config will handle repository configuration for the project
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("repository")
@Import(SpringMongoConfig.class)
public class RepositoryConfig {

    //AutoWire the MongoDbFactory this will from SpringMongoConfig
    @Autowired
    public MongoDbFactory mongoDbFactory;

    /**
     * Test repository to check the applicaiton work or not
     * TODO: DElete this once structure is done and implement most functionality
     *
     * @return
     */
    @Bean
    public TestRepository testRepository() {
        return new TestRepository(mongoDbFactory.getDb());

    }

}
