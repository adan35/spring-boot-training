package com.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

    public FootBallCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
