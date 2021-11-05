package com.sberalex.springdata.persistence.repository

import com.sberalex.springdata.persistence.entity.Book
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface BookRepository: PagingAndSortingRepository<Book, Long> {

    @Query("SELECT b FROM Book b where b.cost > :cost")
    fun findBookMoreExpensiveThen(@Param("cost") cost: Int): List<Book>
}

