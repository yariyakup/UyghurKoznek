package com.uyghurbiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.GeoLocation;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.TrendsResources;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterTrendsResourcesServicesImpl implements TrendsResources {


    @Autowired
    Twitter twitter;
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterTrendsResourcesServicesImpl.class.getName());
    /**
     * Returns the top 10 trending topics for a specific WOEID, if trending information is available for it.<br>
     * The response is an array of "trend" objects that encode the name of the trending topic, the query parameter that can be used to search for the topic on <a href="http://search.twitter.com/">Twitter Search</a>, and the Twitter Search URL.<br>
     * This information is cached for 5 minutes. Requesting more frequently than that will not return any more data, and will count against your rate limit usage.<br>
     * <br>This method calls https://api.twitter.com/1.1/trends/place.json
     *
     * @param woeid <a href="http://developer.yahoo.com/geo/geoplanet/">The Yahoo! Where On Earth ID</a> of the location to return trending information for. Global information is available by using 1 as the WOEID.
     * @return trends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/trends/place">GET trends/place | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public Trends getPlaceTrends(int woeid) throws TwitterException {
        return null;
    }

    /**
     * Returns the locations that Twitter has trending topic information for. The response is an array of &quot;locations&quot; that encode the location's WOEID (a <a href="http://developer.yahoo.com/geo/geoplanet/">Yahoo! Where On Earth ID</a>) and some other human-readable information such as a canonical name and country the location belongs in.
     * <br>This method calls https://api.twitter.com/1.1/trends/available.json
     *
     * @return the locations
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/trends/available">GET trends/available | Twitter Developers</a>
     * @since Twitter4J 2.1.1
     */
    public ResponseList<Location> getAvailableTrends() throws TwitterException {
        return null;
    }

    /**
     * Returns the locations that Twitter has trending topic information for, closest to a specified location.<br>
     * The response is an array of "locations" that encode the location's WOEID and some other human-readable information such as a canonical name and country the location belongs in.<br>
     * A WOEID is a <a href="http://developer.yahoo.com/geo/geoplanet/">Yahoo! Where On Earth ID</a>.
     * <br>This method calls https://api.twitter.com/1.1/trends/closest.json
     *
     * @param location the available trend locations will be sorted by distance to the lat and long passed in. The sort is nearest to furthest.
     * @return the locations
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/trends/closest">GET trends/closest | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public ResponseList<Location> getClosestTrends(GeoLocation location) throws TwitterException {
        return null;
    }
}
