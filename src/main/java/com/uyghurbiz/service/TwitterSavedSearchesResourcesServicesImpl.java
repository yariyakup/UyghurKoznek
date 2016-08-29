package com.uyghurbiz.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.SavedSearchesResources;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterSavedSearchesResourcesServicesImpl implements SavedSearchesResources {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterSuggestedUsersResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;
    /**
     * Returns the authenticated user's saved search queries.
     * <br>This method calls https://api.twitter.com/1.1/saved_searches.json
     *
     * @return Returns an array of numeric user ids the authenticating user is blocking.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/saved_searches">GET saved_searches | Twitter Developers</a>
     * @since Twitter4J 2.0.8
     */
    public ResponseList<SavedSearch> getSavedSearches() throws TwitterException {
        return null;
    }

    /**
     * Retrieve the data for a saved search owned by the authenticating user specified by the given id.
     * <br>This method calls https://api.twitter.com/1.1/saved_searches/show/:id.json
     *
     * @param id The id of the saved search to be retrieved.
     * @return the data for a saved search
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/saved_searches/show/:id">GET saved_searches/show/:id | Twitter Developers</a>
     * @since Twitter4J 2.0.8
     */
    public SavedSearch showSavedSearch(long id) throws TwitterException {
        return null;
    }

    /**
     * Creates a saved search for the authenticated user.
     * <br>This method calls https://api.twitter.com/1.1/saved_searches/saved_searches/create.json
     *
     * @param query the query string
     * @return the data for a created saved search
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/saved_searches/create">POST saved_searches/create | Twitter Developers</a>
     * @since Twitter4J 2.0.8
     */
    public SavedSearch createSavedSearch(String query) throws TwitterException {
        return null;
    }

    /**
     * Destroys a saved search for the authenticated user. The search specified by id must be owned by the authenticating user.
     * <br>This method calls https://api.twitter.com/1.1/saved_searches/destroy/id.json
     *
     * @param id The id of the saved search to be deleted.
     * @return the data for a destroyed saved search
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/saved_searches/destroy/:id">POST saved_searches/destroy/:id | Twitter Developers</a>
     * @since Twitter4J 2.0.8
     */
    public SavedSearch destroySavedSearch(long id) throws TwitterException {
        return null;
    }
}
