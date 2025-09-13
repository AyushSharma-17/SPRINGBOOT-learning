package com.testingpractice.demopractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ayush {
    @GetMapping("/")
    public String testhello() {
        return "Hello World";
    }
    
}
