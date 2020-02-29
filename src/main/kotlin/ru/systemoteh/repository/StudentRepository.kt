package ru.systemoteh.repository

import ru.systemoteh.domain.Student
import java.util.*

class StudentRepository {

    fun findAll(): MutableList<Student> {
        return students
    }

    fun findByName(name: String): List<Student> {
        return students.filter { it.firstName == name }
    }

    companion object {
        val students = mutableListOf<Student>()

        init {
            students.add(
                Student(
                    1,
                    "Ivan",
                    "Ivanovich",
                    "Ivanov",
                    Date(2001, 1, 1),
                    "ivanov@mail.ru"
                )
            )
            students.add(
                Student(
                    2,
                    "Petr",
                    "Petrovich",
                    "Petrov",
                    Date(2002, 2, 2),
                    "petrov@yandex.ru"
                )
            )
            students.add(
                Student(
                    3,
                    "Sidor",
                    "Sidorovich",
                    "Sidorov",
                    Date(2003, 3, 3),
                    "sidorov@gmail.com"
                )
            )
        }
    }
}