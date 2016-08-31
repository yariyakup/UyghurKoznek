package com.uyghurbiz.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.PlacesGeoResources;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterPlacesGeoResourcesServicesImpl implements PlacesGeoResources {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterPlacesGeoResourcesServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;

    /**
     * Find out more details of a place that was returned from the {@link PlacesGeoResources#reverseGeoCode(GeoQuery)} method.
     * <br>This method calls https://api.twitter.com/1.1/geo/id/:id.json
     *
     * @param placeId The ID of the location to query about.
     * @return details of the specified place
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/geo/id/:place_id">GET geo/id/:place_id | Twitter Developers</a>
     * @since Twitter4J 2.1.1
     */
    public Place getGeoDetails(String placeId) throws TwitterException {
        return null;
    }

    /**
     * Search for places (cities and neighborhoods) that can be attached to a statuses/update. Given a latitude and a longitude, return a list of all the valid places that can be used as a place_id when updating a status. Conceptually, a query can be made from the user's location, retrieve a list of places, have the user validate the location he or she is at, and then send the ID of this location up with a call to statuses/update.<br>
     * There are multiple granularities of places that can be returned -- "neighborhoods", "cities", etc. At this time, only United States data is available through this method.<br>
     * This API call is meant to be an informative call and will deliver generalized results about geography.
     * <br>This method calls https://api.twitter.com/1.1/geo/reverse_geocode.json
     *
     * @param query search query
     * @return places (cities and neighborhoods) that can be attached to a statuses/update
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/geo/reverse_geocode">GET geo/reverse_geocode | Twitter Developers</a>
     * @since Twitter4J 2.1.1
     */
    public ResponseList<Place> reverseGeoCode(GeoQuery query) throws TwitterException {
        return null;
    }

    /**
     * Search for places that can be attached to a statuses/update. Given a latitude and a longitude pair, an IP address, or a name, this request will return a list of all the valid places that can be used as the place_id when updating a status.
     * <br>Conceptually, a query can be made from the user's location, retrieve a list of places, have the user validate the location he or she is at, and then send the ID of this location with a call to statuses/update.
     * <br>This is the recommended method to use find places that can be attached to statuses/update. Unlike geo/reverse_geocode which provides raw data access, this endpoint can potentially re-order places with regards to the user who is authenticated. This approach is also preferred for interactive place matching with the user.
     * <br>This method calls https://api.twitter.com/1.1/geo/search.json
     *
     * @param query search query
     * @return places (cities and neighborhoods) that can be attached to a statuses/update
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/geo/search">GET geo/search | Twitter Developers</a>
     * @since Twitter4J 2.1.7
     */
    public ResponseList<Place> searchPlaces(GeoQuery query) throws TwitterException {
        return null;
    }

    /**
     * Locates places near the given coordinates which are similar in name.
     * <br>Conceptually you would use this method to get a list of known places to choose from first. Then, if the desired place doesn't exist, make a request to post/geo/place to create a new one.
     * <br>The token contained in the response is the token needed to be able to create a new place.
     * <br>This method calls https://api.twitter.com/1.1/geo/similar_places.json
     *
     * @param location        The latitude and longitude to search around.
     * @param name            The name a place is known as.
     * @param containedWithin optional: the place_id which you would like to restrict the search results to. Setting this value means only places within the given place_id will be found.
     * @param streetAddress   optional: This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more about Place Attributes.
     * @return places (cities and neighborhoods) that can be attached to a statuses/update
     * @throws TwitterException when Twitter service or network is unavailable
     * @since Twitter4J 2.1.7
     */
    public ResponseList<Place> getSimilarPlaces(GeoLocation location, String name, String containedWithin, String streetAddress) throws TwitterException {
        return null;
    }
}
