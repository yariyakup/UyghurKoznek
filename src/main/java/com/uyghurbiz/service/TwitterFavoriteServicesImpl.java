package com.uyghurbiz.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.FavoritesResources;

import java.util.List;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterFavoriteServices")
public class TwitterFavoriteServicesImpl implements FavoritesResources {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterSuggestedUsersResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;
    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     *
     * @param userId the id of the user for whom to request a list of favorite statuses
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 3.0.0
     */
    public ResponseList<Status> getFavorites(long userId) throws TwitterException {
        return null;
    }

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     *
     * @param screenName the screen name of the user for whom to request a list of favorite statuses
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 2.0.1
     */
    public ResponseList<Status> getFavorites(String screenName) throws TwitterException {
        return null;
    }

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls https://api.twitter.com/1.1/favorites.json
     *
     * @param paging controls pagination. Supports sinceId and page parameters.
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 2.2.5
     */
    public ResponseList<Status> getFavorites(Paging paging) throws TwitterException {
        return null;
    }

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls https://api.twitter.com/1.1/favorites/[id].json
     *
     * @param userId the id of the user for whom to request a list of favorite statuses
     * @param paging controls pagination. Supports sinceId and page parameters.
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 3.0.0
     */
    public ResponseList<Status> getFavorites(long userId, Paging paging) throws TwitterException {
        return null;
    }

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls https://api.twitter.com/1.1/favorites/[id].json
     *
     * @param screenName the screen name of the user for whom to request a list of favorite statuses
     * @param paging     controls pagination. Supports sinceId and page parameters.
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 2.2.5
     */
    public ResponseList<Status> getFavorites(String screenName, Paging paging) throws TwitterException {
        return null;
    }

    /**
     * Favorites the status specified in the ID parameter as the authenticating user.  Returns the favorite status when successful.
     * <br>This method calls https://api.twitter.com/1.1/favorites/create/[id].json
     *
     * @param id the ID of the status to favorite
     * @return created favorite status
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/favorites/create/:id">POST favorites/create/:id | Twitter Developers</a>
     */
    public Status createFavorite(long id) throws TwitterException {
        return null;
    }

    /**
     * Un-favorites the status specified in the ID parameter as the authenticating user.  Returns the un-favorited status in the requested format when successful.
     * <br>This method calls https://api.twitter.com/1.1/favorites/destroy/[id].json
     *
     * @param id the ID of the status to un-favorite
     * @return destroyed statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/favorites/destroy/:id">POST favorites/destroy/:id | Twitter Developers</a>
     */
    public Status destroyFavorite(long id) throws TwitterException {
        return null;
    }

    /**
     * Returns the 20 most recent favorite statuses for the authenticating user or user specified by the ID parameter in the requested format.
     * <br>This method calls https://api.twitter.com/1.1/favorites.json
     *
     * @return favorite statuses
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/favorites">GET favorites | Twitter Developers</a>
     * @since Twitter4J 2.0.1
     */
    public ResponseList<Status> getFavorites() throws TwitterException {
        ResponseList<Status> list = null;
        try {
            list = twitter.getFavorites();
        } catch (TwitterException e) {
            LOGGER.error("Cant get the list of favorites ");
        }
        return list;
    }
}
