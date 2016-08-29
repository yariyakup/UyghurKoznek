package com.uyghurbiz.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.SearchResource;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterSearchResourceServicesImpl implements SearchResource {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterSuggestedUsersResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;
    /**
     * Returns tweets that match a specified query.
     * <br>This method calls http://search.twitter.com/search.json
     *
     * @param query - the search condition
     * @return the result
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/search">GET search | Twitter Developers</a>
     * @see <a href="http://search.twitter.com/operators">Twitter API / Search Operators</a>
     * @since Twitter4J 1.1.7
     */
    public QueryResult search(Query query) throws TwitterException {
        return null;
    }
}
