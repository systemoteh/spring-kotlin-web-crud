package ru.systemoteh.repository

import org.springframework.stereotype.Component
import ru.systemoteh.domain.Student
import java.time.Instant
import java.util.*

@Component
class StudentRepository {

    fun findAll(): MutableList<Student> {
        return students
    }

    fun findByLastName(lastName: String): List<Student> {
        val filteredStudents = students.filter { it.lastName == lastName }
        return if (filteredStudents.isNotEmpty()) filteredStudents else listOf(notFoundStudent)
    }

    fun save(student: Student): Student {
        students.add(student)
        return student
    }

    fun update(id: Long, student: Student): Student {
        return if (delete(id) == notFoundStudent) notFoundStudent else {
            students.add(student)
            student
        }
    }

    fun delete(id: Long): Student {
        val student = students.filter { it.id == id }.getOrElse(0) { notFoundStudent }
        students.remove(student)
        return student
    }

    companion object {
        val students = mutableListOf<Student>()
        val notFoundStudent = Student(
            0, "NotFound", "NotFound", "NotFound", Date.from(
                Instant.now()
            ), "NotFound"
        )

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