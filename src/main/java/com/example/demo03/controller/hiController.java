package com.example.demo03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {
    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi(){
        return "hi spring boot! github02";
    }
}
