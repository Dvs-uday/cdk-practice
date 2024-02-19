package com.cdkpractice.spring_injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
    private Coach mycoach;

    //creating a constructorvfor injection
    @Autowired //it tells spring to inject a dependency
    public Democontroller(Coach thecoach) {
        mycoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyworkout()
    {
        return mycoach.dailyworkout();
    }
}
