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
import twitter4j.api.TimelinesResources;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Service("TwitterTimelinesResourcesServices")
public class TwitterTimelinesResourcesServicesImpl implements TimelinesResources {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterTimelinesResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;

    public ResponseList<Status> getHomeTimeline() {
        ResponseList<Status> list = null;
        try {
            list = twitter.timelines().getHomeTimeline();
        } catch (TwitterException e) {
            //  e.printStackTrace();
            LOGGER.error("Cant get the list of  HomeTimeline ");
        }
        return list;
    }

    public ResponseList<Status> getMentionsTimeline() {
        ResponseList<Status> list = null;
        try {
            list = twitter.timelines().getMentionsTimeline();
        } catch (TwitterException e) {
            LOGGER.error("Cant get the list of  MentionsTimeline ");
        }
        return list;
    }

    public ResponseList<Status> getRetweetsOfMe() {
        ResponseList<Status> list = null;
        try {
            list = twitter.timelines().getRetweetsOfMe();
        } catch (TwitterException e) {
            LOGGER.error("Cant get the list of  RetweetsOfMe ");
        }
        return list;
    }

    public ResponseList<Status> getUserTimeline() {
        ResponseList<Status> list = null;
        try {
            list = twitter.timelines().getUserTimeline();
        } catch (TwitterException e) {
            LOGGER.error("Cant get the list of  UserTimeline ");
        }
        return list;
    }


    public ResponseList<Status> getMentionsTimeline(Paging paging) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getUserTimeline(String screenName, Paging paging) throws TwitterException {
        return null;
    }


    public ResponseList<Status> getUserTimeline(long userId, Paging paging) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getUserTimeline(String screenName) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getUserTimeline(long userId) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getUserTimeline(Paging paging) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getHomeTimeline(Paging paging) throws TwitterException {
        return null;
    }

    public ResponseList<Status> getRetweetsOfMe(Paging paging) throws TwitterException {
        return null;
    }

}
