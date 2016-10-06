package com.uyghurbiz.repository;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import com.uyghurbiz.AbstractSpringContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.util.DBObjectUtils;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Yari_Dev on 10/15/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRepositoryTest extends AbstractSpringContext {

    @Autowired
    Mongo mongo;
    @Value("${mongo.userName}")
    String userName;
    @Value("${mongo.password}")
    String passWord;

    @Test
    public void testConnection() {
        UserCredentials userCredentials = new UserCredentials(userName, passWord);
        MongoOperations mongoOperations = new MongoTemplate(mongo, "Test", userCredentials);
        mongoOperations.createCollection("User");
         // System.out.print(mongo.getDB("Te);

    }
}
