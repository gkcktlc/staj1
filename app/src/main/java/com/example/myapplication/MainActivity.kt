package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                // Tema içinde kullanılacak kodlar buraya gelmeli
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {

                    // Suspend fonksiyonu getCharacters'ı çağırmak için bir coroutine başlatılıyor
                    val apiService = ApiManager.RetrofitClient.getClient().create(RickAndMortyApiService::class.java)
                   val response = apiService.getCharacters(1)

                    CharacterList(response.results)

            }
        }
    }
}


@Composable
fun CharacterList(characters: List<Character>) {

    CharacterAdapter(characters = characters)
}

@Composable
fun CharacterAdapter(characters: List<Character>) {
    LazyColumn {
       items(count=characters.size, itemContent = {posision ->
           CharacterItem(character = characters[posision])
       } )
    }
}




@Composable
fun Text(text: String) {

}
