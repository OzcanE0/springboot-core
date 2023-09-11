package com.experimental.myapp.services;

import com.experimental.myapp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("cricketCoachService")
@Primary
public class CricketCoachService implements Coach {

    public CricketCoachService(){
        System.out.println("Constructor : " + getClass().getCanonicalName()) ;
    }

    @PostConstruct
    public void startUp(){
        System.out.println("Starting up");
    }
    @PreDestroy
    public void gonaDown(){
        System.out.println("Destroying");
    }
    @Override
    public String getDailyExercises() {
        return "exercises";
    }
}
