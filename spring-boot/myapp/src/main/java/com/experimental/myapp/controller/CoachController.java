package com.experimental.myapp.controller;

import com.experimental.myapp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachController {
    private Coach myCoach;

   @Autowired
    public CoachController(@Qualifier("trackCoachService") Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/workout")
    public String getDailyworkout() {
        return myCoach.getDailyExercises();
    }

}
