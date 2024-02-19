package com.Practice1.Practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(path = "/hello")
    public String helloworld()
    {
        return "Hello Sir and Friends";
    }
}
