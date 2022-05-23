package com.frontend.frontend.controllers;

import com.frontend.frontend.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("users",homeService.getAll());
        return modelAndView;
    }
}
