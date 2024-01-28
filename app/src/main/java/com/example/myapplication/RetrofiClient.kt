package com.example.myapplication
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {




    class RetrofitClient {
        companion object {
            private const val BASE_URL = "https://rickandmortyapi.com/api/"

            // Retrofit istemcisini döndüren statik metod
            fun getClient(): Retrofit {
                return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
        }
    }


}

data class CharacterResponse (

    var results: List<Character>

)




