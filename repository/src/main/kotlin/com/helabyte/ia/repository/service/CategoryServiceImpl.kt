package com.helabyte.ia.repository.service

import com.helabyte.ia.repository.model.Category
import com.helabyte.ia.repository.repository.CategoryRepository
import com.helabyte.ia.api.dto.Category as DTOCategory
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {

    override fun getAllCategories(): ArrayList<DTOCategory> {

        return categoryRepository.findAll()
            ?.map { c -> DTOCategory(name = c.name, client = c.client) } as ArrayList
    }

    override fun addCategory(category: DTOCategory): DTOCategory {
        try {
            categoryRepository.save(
                Category(
                    name = category.name,
                    client = category.client
                )
            )
        } catch (e: Exception) {
            throw e;
        }
        return category

    }
}