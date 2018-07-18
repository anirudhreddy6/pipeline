package com.anirudh.pipeline.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @GetMapping(path = "/sample")
    public String hello(){

        return "Hello Pipeline";
    }
}
