package com.example.heroku_deployment_example;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/greeting")
    public String greeting(){
        return "Hello world";
    }

    @GetMapping("/now")
    public Date now(){
        return new Date();
    }
}
