package com.uyghurbiz.controller;

import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.service.TwitterUserResourcesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.TwitterException;


/**
 * Created by Yari_Dev on 10/13/15.
 */
@Controller
@EnableAutoConfiguration
@Import(CoreEngineConfig.class)
public class SampleController {

    @Autowired
    TwitterUserResourcesServicesImpl service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody String home() {
        String user = null;
        try {
            user = service.lookupUsers("Uyghur").toString();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return user;
    }
}
