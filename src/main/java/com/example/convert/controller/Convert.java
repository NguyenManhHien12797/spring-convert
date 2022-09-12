package com.example.convert.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping("/convert")
    public String convert(@RequestParam String usd, @RequestParam String rate, Model model){
        int result = Integer.parseInt(usd)*Integer.parseInt(rate);
        model.addAttribute("rs", result);
        return "index";
    }
}
