package com.kodaa.spring_test.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
