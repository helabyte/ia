package com.helabyte.ia.api.controller.public


import com.helabyte.ia.api.dto.Category
import com.helabyte.ia.repository.service.CategoryService

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("public-category-controller")
@RequestMapping("/p/categories")
class CategoryController(val categoryService: CategoryService) {

    @GetMapping("")
    fun getAllCategories(): ResponseEntity<List<Category?>> {
        return ResponseEntity
            .ok()
            .body(categoryService.getAllCategories());
    }

}