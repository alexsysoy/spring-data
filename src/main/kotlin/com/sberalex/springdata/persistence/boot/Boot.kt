package com.sberalex.springdata.persistence.boot

import com.sberalex.springdata.persistence.entity.Author
import com.sberalex.springdata.persistence.entity.Book
import com.sberalex.springdata.persistence.entity.Publisher

class Boot {
    fun books(): List<Book> {
        // добавляем записи в бд
        val publisher1 = Publisher(name = "МАНН")
        val author1 = Author(firstName = "Ричард", lastName = "Фейнман")
        val book1 = Book(title = "Вы, конечно, шутите, мистер Фейнман!", numberOfPage = 325, cost = 437)
        book1.addAuthor(author1)
        book1.addPublisher(publisher1)

        val publisher2 = Publisher(name = "МИФ")
        val author2 = Author(firstName = "Робби", lastName = "Вайсман")
        val author3 = Author(firstName = "Сьюзен", lastName = "Макклелланд")
        val book2 = Book(title = "Мальчик из Бухенвальда", numberOfPage = 400, cost = 443)
        book2.addAuthor(author2)
        book2.addAuthor(author3)
        book2.addPublisher(publisher2)

        val publisher3 = Publisher(name = "Азбука")
        val author4 = Author(firstName = "", lastName = "Сунь-Цзы")
        val book3 = Book(title = "Искусство войны", numberOfPage = 160, cost = 153)
        book3.addAuthor(author4)
        book3.addPublisher(publisher3)

        val author5 = Author(firstName = "Федор", lastName = "Достоевский")
        val book4 = Book(title = "Братья Карамазовы", numberOfPage = 800, cost = 176)
        book4.addAuthor(author5)
        book4.addPublisher(publisher3)

        val book5 = Book(title = "Идиот", numberOfPage = 900, cost = 256)
        book5.addAuthor(author5)
        book5.addPublisher(publisher3)

        return listOf(book1, book2, book3, book4, book5)
    }
}