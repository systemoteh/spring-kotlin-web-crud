package ru.systemoteh.controller

import ru.systemoteh.repository.StudentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/students")
    fun findAll() = StudentRepository().findAll()

//    @GetMapping("/student/")
//    fun getByName(@RequestParam(value = "name", defaultValue = "") name: String) =
//        Greeting(counter.incrementAndGet(), "Hello, $name")

}