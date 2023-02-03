package com.example.inoks.web;

import com.example.inoks.model.Category;
import com.example.inoks.model.Machine;
import com.example.inoks.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/machines")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public String getMachinesPage(@PathVariable Integer id, Model model) {

            Category category = this.categoryService.findById(id);
        List<Machine> machineList=categoryService.listMachinesFromCategory(id);
        model.addAttribute("machines",machineList);
            model.addAttribute("Categories", category);
            return "machines.html";

    }

}
