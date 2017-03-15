package com.uyghurbiz.core;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * This class is spring mongo db configuration for the spring application,
 * it extends the abstract MongoCongoConfigutration wrap the most function
 * Created by Yari_Dev on 10/9/15.
 */
@Configuration("mongoConfig")
public class SpringMongoConfig extends AbstractMongoConfiguration {

    private String mongoHost;
    /**
     * By Default MongoDb create db named test in local
     *
     * @return DataBaseName
     */
    @Override
    protected String getDatabaseName() {
        return "Test";
    }

    /**
     * Bean that repersant the Mongo Db
     *
     * @return the MongoDb
     * @throws Exception
     */
    @Override
    @Bean
    public Mongo mongo() throws Exception {
        Mongo mongo = new MongoClient("10.22.104.209", 27017);

        return mongo;
    }
}
