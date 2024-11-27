package com.example.lab5.controllers;

import com.example.lab5.repositories.CategoriesRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    public final CategoriesRepository categoriesRepository;

    public CategoriesController(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }
}