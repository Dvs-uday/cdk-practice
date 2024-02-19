package com.cdkpractice.spring_injections.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements  Coach{
    @Override
    public String dailyworkout() {
        return "Run and Jump daily -Basketball";
    }
}
