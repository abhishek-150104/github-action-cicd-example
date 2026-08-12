package com.example.github_cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {
    
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }
     @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2() {
        return "Hello World";
    }

}
