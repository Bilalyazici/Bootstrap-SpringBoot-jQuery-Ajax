package com.example.ajax.Ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstScreenController {

    @GetMapping("/first-page")
    public String firstPage(){
        return "crud";
    }
}
