package com.uyghurbiz.service;

import com.uyghurbiz.AbstractSpringContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.User;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Yari_Dev on 10/15/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterUserServicesTest extends AbstractSpringContext {

    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = Logger.getLogger(TwitterUserServicesTest.class.getName());

    /**
     * This is the twitterService services
     */
    @Autowired
    private TwitterUserServices twitterUserServices;

    /**
     * This will test userService is up
     */
    @Test
    public void testServiceIsUP() {
        List<User> listOfUser = twitterUserServices.getUserResource("Uyghur");
        assertNotEquals("The result list should not be empty", 0, listOfUser.size());
    }
}
