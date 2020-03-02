package ru.systemoteh.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import ru.systemoteh.domain.Student
import ru.systemoteh.service.StudentService

@RestController
class StudentRestController(private val studentService: StudentService) {

    // http://localhost:8080/students
    @GetMapping("/students")
    fun findAll() = studentService.findAll()

    // http://localhost:8080/student?last-name=Petrov
    @GetMapping("/student")
    @ResponseStatus(HttpStatus.FOUND)   // Specify a specific HttpStatus when the response is successful
    fun findByLastName(@RequestParam(value = "last-name", defaultValue = "") lastName: String) =
        studentService.findByLastName(lastName)

    // http://localhost:8080/student/add
    @PostMapping("/student/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun add(@RequestBody student: Student) = studentService.add(student)

    // http://localhost:8080/student/edit-{id}
    @PutMapping("/student/edit-{id}")
    fun edit(@PathVariable id: Long, @RequestBody student: Student) = studentService.edit(id, student)

    // http://localhost:8080/student/delete-{id}
    @DeleteMapping("/student/delete-{id}")
    fun delete(@PathVariable id: Long) = studentService.delete(id)
}