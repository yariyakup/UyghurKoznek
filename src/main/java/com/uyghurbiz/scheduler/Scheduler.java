package com.uyghurbiz.scheduler;

import com.google.gson.Gson;
import com.uyghurbiz.jms.MessageSender;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;

import java.util.ListIterator;

/**
 * Created by yyakup on 8/31/16.
 */
@Component
//@EnableScheduling
public class Scheduler {
    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = LogManager.getLogger(Scheduler.class);

    @Autowired
    UsersResources twitterUserResourcesServices;

    @Autowired
    Gson gson;

    @Autowired
    MessageSender messageSender;

    @Scheduled(fixedRate = 5000)
    public void getUser() {
        int index = 0;
        String[] users = new String[5];
        while (index < 5) {
            users[index] = RandomStringUtils.randomAlphabetic(5).toString();
            index++;
        }
        try {
            ResponseList<User> list = twitterUserResourcesServices.lookupUsers(users);
            if (list != null) {
                ListIterator<User> iterator = list.listIterator();
                while (iterator.hasNext()) {
                 //   messageSender.sendObject(iterator.next());
                    LOGGER.info(iterator.next());
                }
            }
        } catch (TwitterException e) {
            LOGGER.error(e.getMessage());
        }

    }
}
