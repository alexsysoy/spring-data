package com.sberalex.springdata.persistence.repository

import com.sberalex.springdata.persistence.entity.Publisher
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PublisherRepository: CrudRepository<Publisher, Long> {
}