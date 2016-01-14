package com.uyghurbiz.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Category;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.List;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterSuggestedUsersResourcesServices")
public class TwitterSuggestedUsersResourcesServices {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = Logger.getLogger(TwitterSuggestedUsersResourcesServices.class.getName());

    @Autowired
    private Twitter twitter;

    public List<Category> getSuggestedUserCategories(){
        List<Category>categories = null;
        try {
            categories =  twitter.suggestedUsers().getSuggestedUserCategories();

        } catch (TwitterException e) {
            LOGGER.error("Can not get the list of suggested category ");
        }
        return categories;
    }

    public List<User> getSuggestedUser(String categorySlug){
        List<User> users = null;

        try {
            users = twitter.suggestedUsers().getUserSuggestions(categorySlug);
        } catch (TwitterException e) {
            LOGGER.error("can not get suggested users");
        }

        return users;
    }

}