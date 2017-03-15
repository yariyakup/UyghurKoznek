package com.uyghurbiz.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Yari_Dev on 10/13/15.
 */
@RestController
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

}
