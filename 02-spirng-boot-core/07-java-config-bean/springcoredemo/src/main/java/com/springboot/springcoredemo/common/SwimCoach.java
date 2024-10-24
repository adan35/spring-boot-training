package com.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
