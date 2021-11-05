package com.sberalex.springdata.persistence.repository

import com.sberalex.springdata.persistence.entity.Author
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: CrudRepository<Author, Long> {

    fun findAuthorByFirstNameAndLastName(firstName: String, lastName: String): Author
}