package com.example.inoks.web;

import com.example.inoks.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactUs")
public class ContactController {
    @GetMapping()
    public String getMachinesPage() {
        return "contactUs.html";
    }
}
