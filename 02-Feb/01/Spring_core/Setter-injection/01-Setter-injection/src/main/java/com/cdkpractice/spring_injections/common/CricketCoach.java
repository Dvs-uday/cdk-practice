package com.cdkpractice.spring_injections.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements Coach{

    @Override
    public String dailyworkout() {
        return "Practice Spin bowling for 20min !";
    }
}
