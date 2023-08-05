package com.maoco.textapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getMessage(){
        return "Beyler, tırnağım bana küsmüş. Ben düzgün oynayamayacağım sahada kusura bakmayın";
    }
}
