package edu.miu.cs.controller;


import edu.miu.cs.model.Category;
import edu.miu.cs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


@Controller
public class CategoryRestController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/newRest")
    public String newc(){
        return "student";
    }

    @PostMapping(value = "/api/addCategory", produces = "application/json")
    public @ResponseBody Category saveCategory(@Valid @RequestBody Category category) {

        categoryService.save(category);
        return category;
    }

}
