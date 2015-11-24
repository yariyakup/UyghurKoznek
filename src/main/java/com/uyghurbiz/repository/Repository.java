package com.uyghurbiz.repository;

import twitter4j.Query;

/**
 * This interface will put the signature of the operation that we handle with the datasource
 *
 * Created by Yari_Dev on 10/12/15.
 */
public interface Repository {
    /**
     * This signature will get the record
     *
     * @return Sring json representation of the resource
     */
    String getRecord(Query query);

    /**
     * This signature will store the record in mongo db
     *
     * @param record record that stored in mongo db
     */
    void saveRecord(String record);
}
