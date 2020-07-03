package com.kmt.cakefactory.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {

    @GetMapping("/")
    public String showLanding( ) {
        return "home";
    }

}
