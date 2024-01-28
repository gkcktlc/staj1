package com.example.myapplication

data class Character(
    val name: String,
    val status: String,
    val species: String,
    val location: Location,
    val episode: List<String>
)

data class Location(
    val name: String
)
