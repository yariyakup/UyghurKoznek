package com.uyghurbiz.controller;

import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.service.TwitterUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.TwitterObjectFactory;

/**
 * Created by Yari_Dev on 10/13/15.
 */
@Controller
@EnableAutoConfiguration
@Import(CoreEngineConfig.class)
public class SampleController {

    @Autowired
    TwitterUserServices service;

    @RequestMapping("/")
    @ResponseBody
    String home() {

        return "YO YO the size is " + TwitterObjectFactory.getRawJSON(service.getUserResource("Uyghur"));
    }
}
