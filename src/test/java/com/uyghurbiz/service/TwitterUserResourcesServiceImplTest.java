package com.uyghurbiz.service;

import com.uyghurbiz.AbstractSpringContext;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;

import java.util.Random;

/**
 * Created by yyakup on 8/30/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterUserResourcesServiceImplTest extends AbstractSpringContext {
    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = LogManager.getLogger(TwitterUserResourcesServiceImplTest.class);

    /**
     * This is the twitterService services
     */
    @Autowired
    public UsersResources twitterUserResourcesServices;


    @Test
    public void getUserResource() {
        try {
            int index = 0;
            User user;
            String[] users = {"uyghur", "EA"};
         //   while(index < 5) {
             //   users[index]  = RandomStringUtils.randomAlphabetic(5).toString();
                ResponseList<User> list = twitterUserResourcesServices.lookupUsers(users);
             //   if (list != null) {
                   // user = list.get(index);
               //     if (user != null) {
                        LOGGER.info(list.get(0).getDescription());
                 //   }
               // }
                index++;
          //  }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

}
