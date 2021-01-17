package io.hefestos.Models

data class JobVacancy (
        val id: Int,
        val title: String,
        val description: String,
        val salary: Float,
        val workload: Float,
        val shift: String,
        val type: String
)