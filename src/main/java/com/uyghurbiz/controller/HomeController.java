package com.uyghurbiz.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yyakup on 3/26/17.
 */
@RestController
@Api(hidden = true)
public class HomeController {
    @RequestMapping("/")
    public String home() {
           return "Visit /swagger-ui.html";
    };
}
