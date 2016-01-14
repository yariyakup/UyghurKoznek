package com.uyghurbiz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.List;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterFavoriteServices")
public class TwitterFavoriteServices {


    /**
     * Logger for this services
     */
    private static Logger LOGGER = Logger.getLogger(TwitterFavoriteServices.class.getName());

    @Autowired
    private Twitter twitter;

    public List<Status> getFavorites(){
        List<Status> list = null;
        try {
          list=   twitter.favorites().getFavorites();
        } catch (TwitterException e) {
          //  e.printStackTrace();
            LOGGER.error("Cant get the list of  favorites ");
        }
        return list;
    }
}
