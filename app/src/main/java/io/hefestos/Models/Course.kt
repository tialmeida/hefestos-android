package io.hefestos.Models

data class Course (
    val id: Int,
    val title: String,
    val description: String,
    val address: String,
    val price: Float,
    val startDate: String,
    val endDate: String,
    val month: String,
    val startTime: String,
    val endTime: String
)