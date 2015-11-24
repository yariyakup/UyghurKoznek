package com.uyghurbiz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.List;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterUserResourcesServices {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = Logger.getLogger(TwitterUserResourcesServices.class.getName());

    @Autowired
    private Twitter twitter;

    /**
     * This will get the UserResources
     *
     * @param keyWord
     * @return
     */
    public List<User> getUserResource(String keyWord) {
        List<User> listOfUser = null;
        //   twitter.
        try {
            listOfUser = twitter.users().lookupUsers(keyWord);
        } catch (TwitterException e) {
            LOGGER.error("Cant get the list of user based on key: " + keyWord);
        }

        return listOfUser;
    }

}
