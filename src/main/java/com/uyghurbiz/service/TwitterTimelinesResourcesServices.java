package com.uyghurbiz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.List;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterTimelinesResourcesServices")
public class TwitterTimelinesResourcesServices {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = Logger.getLogger(TwitterTimelinesResourcesServices.class.getName());

    @Autowired
    private Twitter twitter;

    public List<Status> getHomeTimeline(){
        List<Status> list = null;
        try {
            list=   twitter.timelines().getHomeTimeline();
        } catch (TwitterException e) {
            //  e.printStackTrace();
            LOGGER.error("Cant get the list of  HomeTimeline ");
        }
        return list;
    }

    public List<Status> getMentionsTimeline(){
        List<Status> list = null;
        try {
            list=   twitter.timelines().getMentionsTimeline();
        } catch (TwitterException e) {
            //  e.printStackTrace();
            LOGGER.error("Cant get the list of  MentionsTimeline ");
        }
        return list;
    }

    public List<Status> getRetweetsOfMe(){
        List<Status> list = null;
        try {
            list=   twitter.timelines().getRetweetsOfMe();
        } catch (TwitterException e) {
            //  e.printStackTrace();
            LOGGER.error("Cant get the list of  RetweetsOfMe ");
        }
        return list;
    }

    public List<Status> getUserTimeline(){
        List<Status> list = null;
        try {
            list=   twitter.timelines().getUserTimeline();
        } catch (TwitterException e) {
            //  e.printStackTrace();
            LOGGER.error("Cant get the list of  UserTimeline ");
        }
        return list;
    }
}
