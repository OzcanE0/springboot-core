package com.experimental.myapp.config;

import com.experimental.myapp.interfaces.Coach;
import com.experimental.myapp.services.TrackCoachService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfiguration {

    @Bean("customId")
    private Coach annoucement(){
        return new TrackCoachService();
    }
}
