package com.maoco.textapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getMessage(){
        return "Welcome maoco :)";
    }

    @GetMapping("/me")
    public String getMe(){
        return "My name is Melih Adnan, I am The CEO of maoco, We will do great things together";
    }
}
