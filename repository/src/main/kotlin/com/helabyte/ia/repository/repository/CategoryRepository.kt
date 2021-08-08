package com.helabyte.ia.repository.repository

import com.helabyte.ia.repository.model.Category
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service
interface CategoryRepository : JpaRepository<Category, Long> {
}