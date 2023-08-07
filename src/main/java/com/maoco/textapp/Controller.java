package com.maoco.textapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping
    public String getMessage(){
        return "Beyler, tırnağım bana küsmüş. Ben düzgün oynayamayacağım sahada kusura bakmayın";
    }

    @PostMapping("/{message}")
    public String sendMessage(@PathVariable String message){
        return "Dediğin mesaj : "+message;
    }

    @DeleteMapping("/{message}")
    public String deleteMessage(@PathVariable String message){
        return "Sildiğin mesaj : "+message;
    }
}
