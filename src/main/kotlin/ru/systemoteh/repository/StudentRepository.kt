package ru.systemoteh.repository

import org.springframework.stereotype.Component
import ru.systemoteh.domain.Student
import java.util.*

@Component
class StudentRepository {

    fun findAll(): MutableList<Student> {
        return students
    }

    fun findByLastName(lastName: String): List<Student> {
        return students.filter { it.lastName == lastName }
    }

    fun save(student: Student): Student {
        students.add(student)
        return student
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
                    Date(101, 0, 1),    // year + 1900
                    "ivanov@mail.ru"
                )
            )
            students.add(
                Student(
                    2,
                    "Petr",
                    "Petrovich",
                    "Petrov",
                    Date(102, 1, 2),
                    "petrov@yandex.ru"
                )
            )
            students.add(
                Student(
                    3,
                    "Sidor",
                    "Sidorovich",
                    "Sidorov",
                    Date(103, 2, 3),
                    "sidorov@gmail.com"
                )
            )
        }
    }
}