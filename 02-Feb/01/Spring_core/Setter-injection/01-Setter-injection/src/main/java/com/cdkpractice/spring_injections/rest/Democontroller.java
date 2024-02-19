package com.cdkpractice.spring_injections.rest;

import com.cdkpractice.spring_injections.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
    private Coach mycoach;

    @Autowired
    public void setcoach(Coach thecoach)
    {
        mycoach=thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyworkout()
    {
        return mycoach.dailyworkout();
    }
}
