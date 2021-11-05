package com.sberalex.springdata.persistence.entity

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "publisher")
class Publisher(
    var name: String,

    @OneToMany(mappedBy = "publisher")
    var books: MutableList<Book> = mutableListOf()

): BaseEntity<Long>()
