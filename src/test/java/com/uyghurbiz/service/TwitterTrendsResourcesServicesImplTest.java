package com.uyghurbiz.service;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.uyghurbiz.AbstractSpringContext;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.Location;
import twitter4j.Trends;
import twitter4j.TwitterException;
import twitter4j.api.TrendsResources;
import java.util.Iterator;

/**
 * Created by yyakup on 9/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterTrendsResourcesServicesImplTest extends AbstractSpringContext {

    @Autowired
    TrendsResources trendsResources;

    /**
     * Logger for the TestCase
     */
    public static Logger LOGGER = LogManager.getLogger(TwitterTrendsResourcesServicesImplTest.class);


    @Test
   // @Ignore
    public void getTrendsCount() {

        Multiset<String> set = HashMultiset.create();
        Iterator<Location> iterator;
        try {
            iterator = trendsResources.getAvailableTrends().listIterator();
            while (iterator.hasNext()) {
                String country = iterator.next().getCountryName();
                set.add(country);
            }
            for (Multiset.Entry<String> entyr : set.entrySet()) {
                LOGGER.debug(entyr.getElement() + ":" + entyr.getCount());
            }
        } catch (TwitterException e1) {
            e1.printStackTrace();
        }

    }
    @Test
    public void getTrends() {
        try {
            Iterator<Location> iterator = trendsResources.getAvailableTrends().listIterator();
            while (iterator.hasNext()) {
            }
        } catch (TwitterException e) {
            LOGGER.error(e.getErrorMessage());
        }

    }
    @Test
    public void getTrendsByPlace() {
        try {
            int randomWoeid = RandomUtils.nextInt(9000000) + 1000000;
            LOGGER.debug("the random woeid:" + randomWoeid);
            Trends trends = trendsResources.getPlaceTrends(1);
        } catch (TwitterException e) {
            e.printStackTrace();
        }


    }
}
