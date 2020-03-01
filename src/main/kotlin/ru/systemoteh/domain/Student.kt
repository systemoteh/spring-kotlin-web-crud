package ru.systemoteh.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.text.SimpleDateFormat
import java.util.*

data class Student(
    @JsonProperty("id")
    val id: Long,
    @JsonProperty("firstName")
    val firstName: String,
    @JsonProperty("middleName")
    val middleName: String,
    @JsonProperty("lastName")
    val lastName: String,
    @JsonProperty("birthDate")
    val birthDate: Date,
    @JsonProperty("email")
    val email: String
) {
    fun getBirthDate(): String {
        return SimpleDateFormat("yyyy-MM-dd").format(birthDate)
    }
}