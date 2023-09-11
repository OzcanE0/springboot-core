package com.experimental.myapp.controller;

import com.experimental.myapp.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
public class ScopeController {
    private final Coach myCoachOne;
    private final Coach mySecond;

    @Autowired
    public ScopeController(@Qualifier("cricketCoachService") Coach theCoach,@Qualifier("cricketCoachService")Coach second){
        myCoachOne=theCoach;
        mySecond=second;
    }

    @GetMapping("/check")
    public String getDailyworkout() {
        return "Compering beans myCoachOne == other bean, " +(myCoachOne==mySecond);
    }
}
