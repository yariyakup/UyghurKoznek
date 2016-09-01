package com.uyghurbiz.service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.uyghurbiz.AbstractSpringContext;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.boot.json.JsonSimpleJsonParser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.JSONTokener;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;

import java.util.ListIterator;
import java.util.Map;

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

    /**
     * Randomly generate string of word and search for the users.
     */
    @Test
    public void getUserResource() {
        int index = 0;
        String[] users = new String[5];
        while (index < 5) {
            users[index] = RandomStringUtils.randomAlphabetic(5).toString();
            index++;
        }
        try {
            ResponseList<User> list = twitterUserResourcesServices.lookupUsers(users);
            Gson gson = new Gson();

            if (list != null) {
                LOGGER.info(gson.toJson(list.get(0)));
                ListIterator<User> iterator = list.listIterator();
//                while (iterator.hasNext()) {
//                    LOGGER.info(iterator.next());
//                }
            }

        } catch (TwitterException e) {
            LOGGER.error(e.getMessage());
        }
        }
    }
