package com.sberalex.springdata.persistence.entity

import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "author")
class Author(
    var firstName: String,
    var lastName: String,

    @ManyToMany(mappedBy = "authors")
    var books: MutableList<Book> = mutableListOf()

): BaseEntity<Long>() {
    override fun toString(): String {
        return "Id: $id имя: $firstName фамилия: $lastName"
    }
}
