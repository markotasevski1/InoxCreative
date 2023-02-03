package com.example.inoks.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partners")
public class parnteriController {
    @GetMapping()
    public String getMachinesPage( Model model) {
        return "partneri.html";
    }
}
