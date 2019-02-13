package com.uyghurbiz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.SpamReportingResource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterSpamReportingResourceServicesImpl implements SpamReportingResource {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterSpamReportingResourceServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;
    /**
     * The user specified in the id is blocked by the authenticated user and reported as a spammer.
     * <br>This method calls https://api.twitter.com/1.1/report_spam.json
     *
     * @param userId The ID of the user you want to report as a spammer.
     * @return The User reported as a spammer.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/report_spam">POST report_spam | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public User reportSpam(long userId) throws TwitterException {
        return null;
    }

    /**
     * The user specified in the id is blocked by the authenticated user and reported as a spammer.
     * <br>This method calls https://api.twitter.com/1.1/report_spam.json
     *
     * @param screenName The screen name of the user you want to report as a spammer.
     * @return The User reported as a spammer.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/report_spam">POST report_spam | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public User reportSpam(String screenName) throws TwitterException {
        return null;
    }
}
