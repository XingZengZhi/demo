package com.example.controller;

import com.example.domain.NeoProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    public String index(){
        NeoProperties neoProperties = new NeoProperties();
        System.out.println(neoProperties.getTitle());
        return "hello.";
    }
}
