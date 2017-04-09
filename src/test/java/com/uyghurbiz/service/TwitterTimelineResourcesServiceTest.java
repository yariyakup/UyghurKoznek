package com.uyghurbiz.service;

import com.google.gson.Gson;
import com.uyghurbiz.AbstractSpringContext;
import com.uyghurbiz.StringUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.api.TimelinesResources;

import java.util.Iterator;

/**
 * Created by yyakup on 9/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterTimelineResourcesServiceTest extends AbstractSpringContext {
    @Autowired
    TimelinesResources twitterTimeLineService;

    @Autowired
    Gson gson;


    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = LogManager.getLogger(TwitterTimelineResourcesServiceTest.class);


    @Test
    public void getUserTimeLine() {
        try {
            ResponseList<Status> responseList = twitterTimeLineService.getUserTimeline("Uyghur");
            Iterator<Status> it = responseList.iterator();
            while (it.hasNext()) {
               // LOGGER.debug(gson.toJson(it.next()));
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void getUserTimeLineForGivenUser() {
        try {

            ResponseList<Status> responseList = twitterTimeLineService.getUserTimeline(StringUtil.getSimilarWord("Uyghur", 0));
            Iterator<Status> it = responseList.iterator();
            while (it.hasNext()) {
                LOGGER.debug(gson.toJson(it.next()));
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
