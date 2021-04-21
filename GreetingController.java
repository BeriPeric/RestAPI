package com.example.restserviceProject4;
//how someone will reacte with our API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


//this is going to be a class that will define request mappings
//entry point into the API
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    //sets id for the greeting
    private final AtomicLong counter = new AtomicLong();

    //this is going to be a GET request to greeting
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value= "name", defaultValue = " to all in COP3503!")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
