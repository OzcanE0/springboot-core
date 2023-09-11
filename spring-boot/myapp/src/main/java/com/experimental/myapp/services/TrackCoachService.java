package com.experimental.myapp.services;

import com.experimental.myapp.interfaces.Coach;
import org.springframework.stereotype.Service;

@Service("trackCoachService")
public class TrackCoachService implements Coach {
    public TrackCoachService(){
        System.out.println("Constructor : " + getClass().getCanonicalName()) ;
    }
    @Override
    public String getDailyExercises() {
        return "track exercises";
    }
}
