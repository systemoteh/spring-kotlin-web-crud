package ru.systemoteh.service

import org.springframework.stereotype.Service
import ru.systemoteh.domain.Student
import ru.systemoteh.repository.StudentRepository

@Service
class StudentService(private val studentRepository: StudentRepository) {
    fun findAll(): Iterable<Student> = studentRepository.findAll()

    fun findByLastName(lastName: String): List<Student> = studentRepository.findByLastName(lastName)

    fun add(student: Student): Student = studentRepository.save(student)

    //fun edit(id: Long, product: Student): Student = studentRepository.save(product.copy(id = id)) // Сохраняем копию объекта с указанным id в БД. Идиоматика Kotlin говорит что НЕ изменяемый - всегда лучше чем изменяемый (никто не поправит значение в другом потоке) и предлагает метод copy для копирования объектов (специальных классов для хранения данных) с возможностью замены значений

    //fun remove(id: Long) = studentRepository.delete(id)
}
