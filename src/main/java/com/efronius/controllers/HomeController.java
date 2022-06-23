package com.efronius.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.efronius.services.ProductService;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model)
    {
        String greeting = "Welcome to Springweb";
        model.addAttribute("msg", greeting);
        model.addAttribute("products", productService.findAll());
        //arahkan ke /templates/index.html
        return "index";
    }
}
