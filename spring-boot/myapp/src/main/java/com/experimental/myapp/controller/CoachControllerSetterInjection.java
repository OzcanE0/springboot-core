package com.experimental.myapp.controller;

import com.experimental.myapp.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/setter")
public class CoachControllerSetterInjection {
    private Coach myCoach;

    @Autowired
    public void getCoach(Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/workout")
    public String getDailyworkout() {
        return myCoach.getDailyExercises()+"setterinjection";
    }
}
