package com.cdkpractice.spring_injections.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements  Coach{
    @Override
    public String dailyworkout() {
        return "Daily Train your Legs for speed -Football";
    }
}
