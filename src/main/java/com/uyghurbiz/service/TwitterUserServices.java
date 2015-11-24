package com.uyghurbiz.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.List;

/**
 * This Service will wrap the twitter UsersResources services
 * Created by Yari_Dev on 9/11/15.
 */
@Service("twitterUserService")
public class TwitterUserServices {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = Logger.getLogger(TwitterUserServices.class.getName());

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

        try {
            listOfUser = twitter.users().lookupUsers(keyWord);
        } catch (TwitterException e) {
            //System.out.println(e.getMessage());
            LOGGER.error("Cant get the list of user based on key: " + keyWord);
        }

        return listOfUser;
    }


}
