package com.uyghurbiz.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yari_Dev on 10/13/15.
 */
@RestController
public class SampleController {
    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(@RequestParam(value = "user", defaultValue = "yari") String user) {
        return "Hello " + user;
    }

}
