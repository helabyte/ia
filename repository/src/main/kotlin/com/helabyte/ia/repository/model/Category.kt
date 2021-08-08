package com.helabyte.ia.repository.model

import javax.persistence.*

@Entity
class Category(
    @Id @GeneratedValue var id: Long? = null,
    val name: String,
    val client: String
) {

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , client = $client )"
    }

}