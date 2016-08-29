package com.uyghurbiz.service;

import com.uyghurbiz.AbstractSpringContext;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.List;


/**
 * Created by Yari_Dev on 10/15/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterUserServicesImplTest extends AbstractSpringContext {

    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = LogManager.getLogger(TwitterUserServicesImplTest.class);

    /**
     * This is the twitterService services
     */
    @Autowired
    private TwitterUserServicesImpl twitterUserServicesImpl;

    /**
     * This will test userService is up
     */
    @Test
    public void testServiceIsUP() {
        List<User> listOfUser = twitterUserServicesImpl.getUserResource("Uyghur");
        User user = listOfUser.get(0);
        LOGGER.info("Yeah User : " +  user.toString());

    }
    @Test
    public void testConfig() {

    }
    /**
     * This will test userService is up
     */
    @Test
    public void userLookUp() {
        ResponseList<User> listOfUser = null;
        try {
            listOfUser = twitterUserServicesImpl.lookupUsers("Ninja");
            User user = listOfUser.get(0);
            LOGGER.info("Yeah User : " +  user.toString());
        } catch (TwitterException e) {
        }
    }
}
