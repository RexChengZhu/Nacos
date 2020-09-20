package com.zc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        String forObject = restTemplate.getForObject("http://provider-01/test", String.class);
        return forObject;
    }
}
