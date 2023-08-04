package com.maoco.textapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getMessage(){
        return "Welcome maoco :)";
    }
}
