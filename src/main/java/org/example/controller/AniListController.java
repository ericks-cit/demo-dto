package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anilist")
public class AniListController {

    @GetMapping("/hello")
    public String sayHello() {
        return "World, hello!";
    }

}
