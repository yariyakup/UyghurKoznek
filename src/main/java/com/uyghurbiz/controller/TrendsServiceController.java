package com.uyghurbiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.api.TrendsResources;

/**
 * Created by yyakup on 3/15/17.
 */
@RestController
public class TrendsServiceController {
    @Autowired
    TrendsResources trendsResources;

    @RequestMapping("/trends")
    public @ResponseBody ResponseList<Location> getTrends() throws TwitterException {
        return trendsResources.getAvailableTrends();
    }

    @RequestMapping(value = "/trend", method = RequestMethod.GET)
    public @ResponseBody ResponseList<Location> trendsMethod() throws TwitterException {
        return trendsResources.getAvailableTrends();
    }

    @ExceptionHandler(TwitterException.class)
    public String handleTrendsServiceExceptions(TwitterException ex) {
        return ex.getErrorMessage();
    }
}
