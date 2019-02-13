package com.uyghurbiz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;

/**
 * Created by yyakup on 3/15/17.
 */
@RestController
@CrossOrigin
@Api(basePath = "/user", value = "User", description = "Operations with User", produces = "application/json")
public class TweetServiceController {
    @Autowired
    private UsersResources twitterUserResourceService;


    @RequestMapping(value = "/lookUpUser", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "lookUpUser", nickname = "lookUp")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Location.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "User's name", required = true, dataType = "string", paramType = "query", defaultValue="Uyghur")
    })
    public ResponseList<User> lookUpUser(@RequestParam(value = "user", defaultValue = "Uyghur") String user) throws TwitterException {
        String userTobeSearch = StringUtils.trim(user);
       return twitterUserResourceService.lookupUsers(userTobeSearch);
    }

    /**
     * Show detailed user info
     * Visit https://api.twitter.com/1.1/users/show.json
     * @param user
     * @return
     * @throws TwitterException
     */
    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "lookUpUser", nickname = "lookUp")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Location.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "User's name", required = true, dataType = "string", paramType = "query", defaultValue="Uyghur")
    })
    public User showUser(@RequestParam(value = "user", defaultValue = "Uyghur") String user) throws TwitterException {
        String userTobeSearch = StringUtils.trim(user);
        return twitterUserResourceService.showUser(userTobeSearch);
    }


    @ExceptionHandler(TwitterException.class)
    public String handleException(TwitterException ex) {
        return  ex.getErrorMessage();
    }
}
