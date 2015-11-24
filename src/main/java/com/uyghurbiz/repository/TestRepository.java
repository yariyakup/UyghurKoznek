package com.uyghurbiz.repository;

import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * com.uyghurbiz.repository.TestRepository Pattern
 * Created by Yari_Dev on 9/12/15.
 */
@org.springframework.stereotype.Repository("testRepository")
public class TestRepository {

    private DB mongoDb;

    public TestRepository(@Qualifier("mongoDb") DB db) {
        this.mongoDb = db;
    }

    public boolean isDbContainCollection() {

        return mongoDb.collectionExists("testCollection");
    }
}
