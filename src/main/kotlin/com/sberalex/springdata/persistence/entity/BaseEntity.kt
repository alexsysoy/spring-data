package com.sberalex.springdata.persistence.entity

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity<T: Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: T? = null

    override fun equals(other: Any?): Boolean {

        other ?: return false

        if (this === other) return true

        other as BaseEntity<*>

        return this.id != null && this.id == other.id
    }

    override fun hashCode() = 42

    override fun toString(): String {
        return "${this.javaClass.simpleName}(id = $id)"
    }
}
