package com.experimental.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
        @GetMapping("/workout")
        public String workout() {
            return "workout";
        }

        @GetMapping("/inject")
    public String inject(){
        return coachName+teamName;
        }

}