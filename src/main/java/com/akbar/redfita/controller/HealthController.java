package com.akbar.redfita.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String getAppHealth() {
        return "IT'S UP!";
    }


}
