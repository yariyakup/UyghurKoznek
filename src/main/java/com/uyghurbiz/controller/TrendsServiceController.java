package com.uyghurbiz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trends;
import twitter4j.TwitterException;
import twitter4j.api.TrendsResources;

/**
 * Created by yyakup on 3/15/17.
 */
@RestController
@CrossOrigin
@Api(basePath = "/trends", value = "Trends", description = "Operations with Trends", produces = "application/json")
public class TrendsServiceController {
    @Autowired
    TrendsResources trendsResources;

    /**
     *
     * @return
     * @throws TwitterException
     */
    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    @ApiOperation(value = "location", nickname = "locationWhichHasAvailableTrends", notes = "List Location which has trends")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Location.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public @ResponseBody
    ResponseList<Location> availableTrends() throws TwitterException {
        return trendsResources.getAvailableTrends();
    }

    /**
     *
     * @return
     * @throws TwitterException
     */
    @RequestMapping(value = "/trends", method = RequestMethod.GET)
    @ApiOperation(value = "woeid", nickname = "trendsForWOEID", notes = "List Trends for the woeid")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Trends.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public @ResponseBody
    Trends getTrends(String woeid) throws TwitterException {

        // woeid 1 is worldwide.
        int defaultWoeid = 1;
        if (woeid != null) {
            defaultWoeid = Integer.parseInt(woeid);

        }
        return trendsResources.getPlaceTrends(defaultWoeid);
    }

    @ExceptionHandler(TwitterException.class)
    public String handleTrendsServiceExceptions(TwitterException ex) {
        return ex.getErrorMessage();
    }
}
