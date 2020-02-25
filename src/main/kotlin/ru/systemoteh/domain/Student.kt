package ru.systemoteh.domain

import java.util.*

data class Student(
    val id: Long,
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val birthDate: Date,
    val email: String
)