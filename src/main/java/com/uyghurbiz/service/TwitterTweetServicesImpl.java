package com.uyghurbiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.IDs;
import twitter4j.OEmbed;
import twitter4j.OEmbedRequest;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UploadedMedia;
import twitter4j.api.TweetsResources;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterTweetServicesImpl implements TweetsResources {

    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterTweetServicesImpl.class.getName());

    @Autowired
    Twitter twitter;

    public OEmbed getOEmbed(OEmbedRequest req) throws TwitterException {
        return null;
    }

    
    public ResponseList<Status> getRetweets(long statusId) throws TwitterException {
        return null;
    }

    
    public IDs getRetweeterIds(long statusId, long cursor) throws TwitterException {
        return null;
    }

    
    public IDs getRetweeterIds(long statusId, int count, long cursor) throws TwitterException {
        return null;
    }

    
    public Status showStatus(long id) throws TwitterException {
        return null;
    }

    
    public Status destroyStatus(long statusId) throws TwitterException {
        return null;
    }

    
    public Status updateStatus(String status) throws TwitterException {
        return null;
    }

    
    public Status updateStatus(StatusUpdate latestStatus) throws TwitterException {
        return null;
    }

    
    public Status retweetStatus(long statusId) throws TwitterException {
        return null;
    }

    
    public ResponseList<Status> lookup(long... ids) throws TwitterException {
        return null;
    }

    
    public UploadedMedia uploadMedia(File mediaFile) throws TwitterException {
        return null;
    }

    
    public UploadedMedia uploadMedia(String fileName, InputStream media) throws TwitterException {
        return null;
    }

}
