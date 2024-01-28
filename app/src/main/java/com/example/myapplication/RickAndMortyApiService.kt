package com.example.myapplication


import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApiService {
    @GET("character")
    fun getCharacters(@Query("page") page: Int): CharacterResponse
}

