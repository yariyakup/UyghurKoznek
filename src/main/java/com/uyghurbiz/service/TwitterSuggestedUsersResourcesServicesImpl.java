package com.uyghurbiz.service;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.SuggestedUsersResources;


/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterSuggestedUsersResourcesServices")
public class TwitterSuggestedUsersResourcesServicesImpl implements SuggestedUsersResources {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterSuggestedUsersResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;
    /**
     * Access the users in a given category of the Twitter suggested user list.<br>
     * It is recommended that end clients cache this data for no more than one hour.
     * <br>This method calls https://api.twitter.com/1.1/users/suggestions/:slug.json
     *
     * @param categorySlug slug
     * @return list of suggested users
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/users/suggestions/:slug">GET users/suggestions/:slug | Twitter Developers</a>
     * @since Twitter4J 2.1.1
     */
    public ResponseList<User> getUserSuggestions(String categorySlug) throws TwitterException {
        ResponseList<User> users = null;

        try {
            users = twitter.suggestedUsers().getUserSuggestions(categorySlug);
        } catch (TwitterException e) {
            LOGGER.error("can not get suggested users");
        }

        return users;
    }

    /**
     * Access the users in a given category of the Twitter suggested user list and return their most recent status if they are not a protected user.
     * <br>This method has not been finalized and the interface is subject to change in incompatible ways.
     * <br>This method calls https://api.twitter.com/1.1/users/suggestions/:slug/members.json
     *
     * @param categorySlug slug
     * @return list of suggested users
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/users/suggestions/%3Aslug/members">GET users/suggestions/:slug/members | Twitter Developers</a>
     * @since Twitter4J 2.1.9
     */
    public ResponseList<User> getMemberSuggestions(String categorySlug) throws TwitterException {
        return null;
    }


    public ResponseList<Category> getSuggestedUserCategories(){
        ResponseList<Category>categories = null;
        try {
            categories =  twitter.suggestedUsers().getSuggestedUserCategories();

        } catch (TwitterException e) {
            LOGGER.error("Can not get the list of suggested category ");
        }
        return categories;
    }

}