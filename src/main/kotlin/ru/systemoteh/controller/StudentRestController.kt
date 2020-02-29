package ru.systemoteh.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.systemoteh.repository.StudentRepository

@RestController
class GreetingController {

    // http://localhost:8080/students
    @GetMapping("/students")
    fun findAll() = StudentRepository().findAll()

    // http://localhost:8080/student?name=Petr
    @GetMapping("/student")
    fun findByName(@RequestParam(value = "name", defaultValue = "") name: String) =
        StudentRepository().findByName(name)

}