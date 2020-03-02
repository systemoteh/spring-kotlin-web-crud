package ru.systemoteh.service

import org.springframework.stereotype.Service
import ru.systemoteh.domain.Student
import ru.systemoteh.repository.StudentRepository

@Service
class StudentService(private val studentRepository: StudentRepository) {
    fun findAll(): Iterable<Student> = studentRepository.findAll()

    fun findByLastName(lastName: String): List<Student> = studentRepository.findByLastName(lastName)

    fun add(student: Student): Student = studentRepository.save(student)

    fun edit(id: Long, student: Student): Student = studentRepository.update(id, student)

    fun delete(id: Long): Student = studentRepository.delete(id)
}
