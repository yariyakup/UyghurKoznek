package com.uyghurbiz.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import twitter4j.Friendship;
import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.FriendsFollowersResources;

/**
 * Created by Yari_Dev on 10/12/15.
 */
public class TwitterFriendsFollowersServicesImpl implements FriendsFollowersResources {
    /**
     * Logger for this services
     */
    private static Logger LOGGER = LogManager.getLogger(TwitterFriendsFollowersServicesImpl.class.getName());

    @Autowired
    private Twitter twitter;

    /**
     * Returns a collection of user IDs that the currently authenticated user does not want to receive retweets from.
     * <br>This method calls https://api.twitter.com/1.1/friendships/no_retweets/ids.json
     *
     * @return a collection of numeric IDs that the currently authenticated user does not want to receive retweets from.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friendships/no_retweets/ids">GET friendships/no_retweets/ids | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public IDs getNoRetweetsFriendships() throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the authenticating user is following.
     * <br>This method calls https://api.twitter.com/1.1/friends/ids.json
     *
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return an array of numeric IDs for every user the authenticating user is following
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/ids">GET friends/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFriendsIDs(long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is following.
     * <br>This method calls https://api.twitter.com/1.1/friends/ids.json
     *
     * @param userId Specifies the ID of the user for whom to return the friends list.
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return an array of numeric IDs for every user the specified user is following
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/ids">GET friends/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFriendsIDs(long userId, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is following.
     * <br>This method calls http://api.twitter.com/1.1/friends/ids.json
     *
     * @param userId Specifies the ID of the user for whom to return the friends list.
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @param count  Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. The value of count is best thought of as a limit to the number of results to return.<br>
     *               When using the count parameter with this method, it is wise to use a consistent count value across all requests to the same user's collection.<br>
     *               Usage of this parameter is encouraged in environments where all 5,000 IDs constitutes too large of a response.
     * @return an array of numeric IDs for every user the specified user is following
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/ids">GET friends/ids | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public IDs getFriendsIDs(long userId, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is following.
     * <br>This method calls https://api.twitter.com/1.1/friends/ids.json
     *
     * @param screenName Specifies the screen name of the user for whom to return the friends list.
     * @param cursor     Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *                   To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return an array of numeric IDs for every user the specified user is following
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/ids">GET friends/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFriendsIDs(String screenName, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is following.
     * <br>This method calls http://api.twitter.com/1.1/friends/ids.json
     *
     * @param screenName Specifies the screen name of the user for whom to return the friends list.
     * @param cursor     Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *                   To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @param count      Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. The value of count is best thought of as a limit to the number of results to return.<br>
     *                   When using the count parameter with this method, it is wise to use a consistent count value across all requests to the same user's collection.<br>
     *                   Usage of this parameter is encouraged in environments where all 5,000 IDs constitutes too large of a response.
     * @return an array of numeric IDs for every user the specified user is following
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/ids">GET friends/ids | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public IDs getFriendsIDs(String screenName, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is followed by.
     * <br>This method calls https://api.twitter.com/1.1/followers/ids.json
     *
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return The ID or screen_name of the user to retrieve the friends ID list for.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/ids">GET followers/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFollowersIDs(long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is followed by.
     * <br>This method calls https://api.twitter.com/1.1/followers/ids.json
     *
     * @param userId Specifies the ID of the user for whom to return the followers list.
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return The ID or screen_name of the user to retrieve the friends ID list for.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/ids">GET followers/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFollowersIDs(long userId, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is followed by.
     * <br>This method calls http://api.twitter.com/1.1/followers/ids.json
     *
     * @param userId Specifies the ID of the user for whom to return the followers list.
     * @param cursor Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *               To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @param count  Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. <br>
     *               The value of count is best thought of as a limit to the number of results to return. <br>
     *               When using the count parameter with this method, it is wise to use a consistent count value across all requests to the same user's collection. Usage of this parameter is encouraged in environments where all 5,000 IDs constitutes too large of a response.
     * @return The ID or screen_name of the user to retrieve the friends ID list for.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/ids">GET followers/ids | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public IDs getFollowersIDs(long userId, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is followed by.
     * <br>This method calls https://api.twitter.com/1.1/followers/ids.json
     *
     * @param screenName Specifies the screen name of the user for whom to return the followers list.
     * @param cursor     Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *                   To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @return The ID or screen_name of the user to retrieve the friends ID list for.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/ids">GET followers/ids | Twitter Developers</a>
     * @since Twitter4J 2.0.10
     */
    public IDs getFollowersIDs(String screenName, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user the specified user is followed by.
     * <br>This method calls http://api.twitter.com/1.1/followers/ids.json
     *
     * @param screenName Specifies the screen name of the user for whom to return the followers list.
     * @param cursor     Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filterd out after connections are queried. <br>
     *                   To begin paging provide a value of -1 as the cursor. The response from the API will include a previous_cursor and next_cursor to allow paging back and forth.
     * @param count      Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. <br>
     *                   The value of count is best thought of as a limit to the number of results to return. <br>
     *                   When using the count parameter with this method, it is wise to use a consistent count value across all requests to the same user's collection. Usage of this parameter is encouraged in environments where all 5,000 IDs constitutes too large of a response.
     * @return The ID or screen_name of the user to retrieve the friends ID list for.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/ids">GET followers/ids | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public IDs getFollowersIDs(String screenName, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns the relationship of the authenticating user to the specified users.
     * <br>This method has not been finalized and the interface is subject to change in incompatible ways.
     * <br>This method calls https://api.twitter.com/1.1/friendships/lookup.json
     *
     * @param ids array of the ids to lookup
     * @return list of Relationships
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter and the API - Twitter API Announcements | Google Group</a>
     * @since Twitter4J 2.1.9
     */
    public ResponseList<Friendship> lookupFriendships(long... ids) throws TwitterException {
        return null;
    }

    /**
     * Returns the relationship of the authenticating user to the specified users.
     * <br>This method has not been finalized and the interface is subject to change in incompatible ways.
     * <br>This method calls https://api.twitter.com/1.1/friendships/lookup.json
     *
     * @param screenNames array of the screen names to lookup
     * @return list of Relationships
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter and the API - Twitter API Announcements | Google Group</a>
     * @since Twitter4J 2.1.9
     */
    public ResponseList<Friendship> lookupFriendships(String... screenNames) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every user who has a pending request to follow the authenticating user.
     * <br>This method calls https://api.twitter.com/1.1/friendships/incoming.json
     *
     * @param cursor Breaks the results into pages. A single page contains 5000 identifiers. Provide a value of -1 to begin paging.
     * @return an array of numeric IDs for every user who has a pending request to follow the authenticating user.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friendships/incoming">GET friendships/incoming | Twitter Developers</a>
     * @since Twitter4J 2.1.2
     */
    public IDs getIncomingFriendships(long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns an array of numeric IDs for every protected user for whom the authenticating user has a pending follow request.
     * <br>This method calls https://api.twitter.com/1.1/friendships/outgoing.json
     *
     * @param cursor Breaks the results into pages. A single page contains 5000 identifiers. Provide a value of -1 to begin paging.
     * @return an array of numeric IDs for every protected user for whom the authenticating user has a pending follow request.
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friendships/outgoing">GET friendships/outgoing | Twitter Developers</a>
     * @since Twitter4J 2.1.2
     */
    public IDs getOutgoingFriendships(long cursor) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to follow the user specified in the ID parameter.<br>
     * Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. If you are already friends with the user an HTTP 403 will be returned.
     * <br>This method calls https://api.twitter.com/1.1/friendships/create/[id].json
     *
     * @param userId the ID of the user to be befriended
     * @return the befriended user
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST friendships/create | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public User createFriendship(long userId) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to follow the user specified in the ID parameter.<br>
     * Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. If you are already friends with the user an HTTP 403 will be returned.
     * <br>This method calls https://api.twitter.com/1.1/friendships/create/[id].json
     *
     * @param screenName the screen name of the user to be befriended
     * @return the befriended user
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST friendships/create | Twitter Developers</a>
     * @since Twitter4J 2.0.1
     */
    public User createFriendship(String screenName) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to follow the user specified in the ID parameter.<br>
     * Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. If you are already friends with the user an HTTP 403 will be returned.
     * <br>This method calls https://api.twitter.com/1.1/friendships/create/[id].json
     *
     * @param userId the ID of the user to be befriended
     * @param follow Enable notifications for the target user in addition to becoming friends.
     * @return the befriended user
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST friendships/create | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public User createFriendship(long userId, boolean follow) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to follow the user specified in the ID parameter.<br>
     * Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. If you are already friends with the user an HTTP 403 will be returned.
     * <br>This method calls https://api.twitter.com/1.1/friendships/create/[id].json
     *
     * @param screenName the screen name of the user to be befriended
     * @param follow     Enable notifications for the target user in addition to becoming friends.
     * @return the befriended user
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST friendships/create | Twitter Developers</a>
     * @since Twitter4J 2.0.2
     */
    public User createFriendship(String screenName, boolean follow) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to unfollow the user specified in the ID parameter.<br>
     * Returns the unfollowed user in the requested format when successful. Returns a string describing the failure condition when unsuccessful.
     * <br>This method calls https://api.twitter.com/1.1/friendships/destroy/[id].json
     *
     * @param userId the ID of the user for whom to request a list of friends
     * @return User
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/destroy">POST friendships/destroy | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public User destroyFriendship(long userId) throws TwitterException {
        return null;
    }

    /**
     * Allows the authenticating users to unfollow the user specified in the ID parameter.<br>
     * Returns the unfollowed user in the requested format when successful. Returns a string describing the failure condition when unsuccessful.
     * <br>This method calls https://api.twitter.com/1.1/friendships/destroy/[id].json
     *
     * @param screenName the screen name of the user for whom to request a list of friends
     * @return User
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/friendships/destroy">POST friendships/destroy | Twitter Developers</a>
     * @since Twitter4J 2.0.1
     */
    public User destroyFriendship(String screenName) throws TwitterException {
        return null;
    }

    /**
     * Allows you to enable or disable retweets and device notifications from the specified user.
     * <br>This method has not been finalized and the interface is subject to change in incompatible ways.
     * <br>This method calls https://api.twitter.com/1.1/friendships/update.json
     *
     * @param userId                   user id to update
     * @param enableDeviceNotification set true to enable device notification
     * @param retweets                 set true to enable retweets
     * @return Relationship
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter and the API - Twitter API Announcements | Google Group</a>
     * @since Twitter4J 2.1.9
     */
    public Relationship updateFriendship(long userId, boolean enableDeviceNotification, boolean retweets) throws TwitterException {
        return null;
    }

    /**
     * Allows you to enable or disable retweets and device notifications from the specified user.
     * <br>This method has not been finalized and the interface is subject to change in incompatible ways.
     * <br>This method calls https://api.twitter.com/1.1/friendships/update.json
     *
     * @param screenName               screen name to update
     * @param enableDeviceNotification set true to enable device notification
     * @param retweets                 set true to enable retweets
     * @return Relationship
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter and the API - Twitter API Announcements | Google Group</a>
     * @since Twitter4J 2.1.9
     */
    public Relationship updateFriendship(String screenName, boolean enableDeviceNotification, boolean retweets) throws TwitterException {
        return null;
    }

    /**
     * Returns detailed information about the relationship between two users.
     * <br>This method calls https://api.twitter.com/1.1/friendships/show.json
     *
     * @param sourceId the ID of the source user
     * @param targetId the ID of the target user
     * @return Relationship
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friendships/show">GET friendships/show | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public Relationship showFriendship(long sourceId, long targetId) throws TwitterException {
        return null;
    }

    /**
     * Returns detailed information about the relationship between two users.
     * <br>This method calls https://api.twitter.com/1.1/friendships/show.json
     *
     * @param sourceScreenName the screen name of the source user
     * @param targetScreenName the screen name of the target user
     * @return Relationship
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friendships/show">GET friendships/show | Twitter Developers</a>
     * @since Twitter4J 2.1.0
     */
    public Relationship showFriendship(String sourceScreenName, String targetScreenName) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param userId The ID of the user for whom to return results for.
     * @param cursor Causes the results to be broken into pages of no more than 20 records at a time.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public PagableResponseList<User> getFriendsList(long userId, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param userId The ID of the user for whom to return results for.
     * @param cursor Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count  The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     */
    public PagableResponseList<User> getFriendsList(long userId, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param screenName The screen name of the user for whom to return results for.
     * @param cursor     Causes the results to be broken into pages of no more than 20 records at a time.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public PagableResponseList<User> getFriendsList(String screenName, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param screenName The screen name of the user for whom to return results for.
     * @param cursor     Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count      The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public PagableResponseList<User> getFriendsList(String screenName, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param userId              The ID of the user for whom to return results for.
     * @param cursor              Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count               The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @param skipStatus          When set to either true, statuses will not be included in the returned user objects.
     * @param includeUserEntities The user object entities node will be disincluded when set to false.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public PagableResponseList<User> getFriendsList(long userId, long cursor, int count, boolean skipStatus, boolean includeUserEntities) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their "friends").<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/friends/list.json
     *
     * @param screenName          The screen name of the user for whom to return results for.
     * @param cursor              Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count               The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @param skipStatus          When set to either true, statuses will not be included in the returned user objects.
     * @param includeUserEntities The user object entities node will be disincluded when set to false.
     * @return list of friends
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/friends/list">GET friends/list | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public PagableResponseList<User> getFriendsList(String screenName, long cursor, int count, boolean skipStatus, boolean includeUserEntities) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param userId The ID of the user for whom to return results for.
     * @param cursor Causes the results to be broken into pages of no more than 20 records at a time.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public PagableResponseList<User> getFollowersList(long userId, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param screenName The screen name of the user for whom to return results for.
     * @param cursor     Causes the results to be broken into pages of no more than 20 records at a time.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 3.0.2
     */
    public PagableResponseList<User> getFollowersList(String screenName, long cursor) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param userId The ID of the user for whom to return results for.
     * @param cursor Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count  The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 3.0.6
     */
    public PagableResponseList<User> getFollowersList(long userId, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param screenName The screen name of the user for whom to return results for.
     * @param cursor     Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count      The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 3.0.6
     */
    public PagableResponseList<User> getFollowersList(String screenName, long cursor, int count) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param userId              The ID of the user for whom to return results for.
     * @param cursor              Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count               The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @param skipStatus          When set to either true, statuses will not be included in the returned user objects.
     * @param includeUserEntities The user object entities node will be disincluded when set to false.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public PagableResponseList<User> getFollowersList(long userId, long cursor, int count, boolean skipStatus, boolean includeUserEntities) throws TwitterException {
        return null;
    }

    /**
     * Returns a cursored collection of user objects for users following the specified user.<br>
     * At this time, results are ordered with the most recent following first — however, this ordering is subject to unannounced change and eventual consistency issues. Results are given in groups of 20 users and multiple "pages" of results can be navigated through using the next_cursor value in subsequent requests. See <a href="https://dev.twitter.com/docs/misc/cursoring">Using cursors to navigate collections</a> for more information.
     * <br>This method calls https://api.twitter.com/1.1/followers/list.json
     *
     * @param screenName          The screen name of the user for whom to return results for.
     * @param cursor              Causes the results to be broken into pages of no more than 20 records at a time.
     * @param count               The number of users to return per page, up to a maximum of 200. Defaults to 20.
     * @param skipStatus          When set to either true, statuses will not be included in the returned user objects.
     * @param includeUserEntities The user object entities node will be disincluded when set to false.
     * @return list of followers
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://dev.twitter.com/docs/api/1.1/get/followers/list">GET followers/list | Twitter Developers</a>
     * @since Twitter4J 4.0.2
     */
    public PagableResponseList<User> getFollowersList(String screenName, long cursor, int count, boolean skipStatus, boolean includeUserEntities) throws TwitterException {
        return null;
    }
}
