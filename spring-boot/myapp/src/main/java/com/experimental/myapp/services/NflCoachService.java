package com.experimental.myapp.services;

import com.experimental.myapp.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class NflCoachService implements Coach {
    public NflCoachService(){
        System.out.println("Constructor : " + getClass().getCanonicalName()) ;
    }
    @Override
    public String getDailyExercises() {
        return "NFLexercises";
    }
}
