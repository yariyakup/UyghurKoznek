package com.uyghurbiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.ResponseList;
import twitter4j.api.UsersResources;


/**
 * Created by Yari_Dev on 10/13/15.
 */
@RestController
public class SampleController {
    @Autowired
    private UsersResources twitterUserResourceService;
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
    @RequestMapping("/user")
    @ResponseBody
    public ResponseList<User> user(@RequestParam(value = "user", defaultValue = "yari") String user) {
        ResponseList< User > list = null;
        try {
            list = twitterUserResourceService.lookupUsers(user);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return list;
    }

}
