package com.helabyte.ia.repository.service

import com.helabyte.ia.api.dto.Category


interface CategoryService {

    fun getAllCategories(): List<Category>
    fun addCategory(category: Category): Category
}