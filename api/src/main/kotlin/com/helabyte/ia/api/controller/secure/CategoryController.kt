package com.helabyte.ia.api.controller.secure

import com.helabyte.ia.api.dto.Category
import com.helabyte.ia.repository.service.CategoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/s/categories")
@RestController("secure-category-controller")
class CategoryController(val categoryService: CategoryService) {

    @PostMapping
    fun addNewCategory(@RequestBody category: Category): ResponseEntity<Category> {
        return ResponseEntity.ok().body(categoryService.addCategory(category));
    }

}