package ru.systemoteh.domain

import java.text.SimpleDateFormat
import java.util.*

data class Student(
    val id: Long,
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val birthDate: Date,
    val email: String
) {
    fun getBirthDate(): String {
        return SimpleDateFormat("yyyy-MM-dd").format(birthDate)
    }
}