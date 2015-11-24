package com.uyghurbiz.core;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * This class is spring mongo db configuration for the spring application,
 * it extends the abstract MongoCongoConfigutration wrap the most function
 * Created by Yari_Dev on 10/9/15.
 */
@Configuration("mongoConfig")
public class SpringMongoConfig extends AbstractMongoConfiguration {

    /**
     * By Default MongoDb create db named test in local
     *
     * @return DataBaseName
     */
    @Override
    protected String getDatabaseName() {
        return "test";
    }

    /**
     * Bean that repersant the Mongo Db
     *
     * @return the MongoDb
     * @throws Exception
     */
    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new MongoClient("localhost", 27017);

        return mongo;
    }
}
