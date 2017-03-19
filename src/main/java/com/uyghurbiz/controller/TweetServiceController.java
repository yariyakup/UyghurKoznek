package com.uyghurbiz.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yyakup on 3/15/17.
 */
@RestController
public class TweetServiceController {
    @Autowired
    private UsersResources twitterUserResourceService;

    @RequestMapping("/")
    @ResponseBody
    public List<String> home() {
        List<String> listOfService = new ArrayList<String>();
        listOfService.add("/user");
        listOfService.add("/trends");
        listOfService.add("/trend");
        return listOfService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public ResponseList<User> user(@RequestParam(value = "user", defaultValue = "Uyghur") String user) throws TwitterException {
        String userTobeSearch = StringUtils.trim(user);
       return twitterUserResourceService.lookupUsers(userTobeSearch);
    }

    @ExceptionHandler(TwitterException.class)
    public String handleException(TwitterException ex) {
        return  ex.getErrorMessage();
    }
}
