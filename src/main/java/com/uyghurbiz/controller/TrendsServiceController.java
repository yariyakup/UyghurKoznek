package com.uyghurbiz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Api(basePath = "/trends", value = "Trends", description = "Operations with Trends", produces = "application/json")
public class TrendsServiceController {
    @Autowired
    TrendsResources trendsResources;

    @RequestMapping("/trends")
    @ApiOperation(value = "getTrends", nickname = "availableTrends")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Location.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public @ResponseBody ResponseList<Location> availableTrends() throws TwitterException {
        return trendsResources.getAvailableTrends();
    }

    @ExceptionHandler(TwitterException.class)
    public String handleTrendsServiceExceptions(TwitterException ex) {
        return ex.getErrorMessage();
    }
}
