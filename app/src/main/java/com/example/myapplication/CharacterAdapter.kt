package com.example.myapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

private val Typography.body1: TextStyle
    get() {
        TODO("Not yet implemented")
    }
val Typography.h6: TextStyle
    get() {
        TODO("Not yet implemented")
    }

@Composable
fun CharacterAdapter(characters: List<java.lang.Character>) {
    LazyColumn {
        items(characters) { character ->
            CharacterItem(character)
        }
    }
}

fun CharacterItem(character: java.lang.Character) {
    TODO("Not yet implemented")
}


@Composable
@Preview
fun CharacterItemPreview() {
    val sampleCharacter = Character(
        name = "Rick Sanchez",
        status = "Alive",
        species = "Human",
        location = Location("Earth"),
        episode = listOf("S01E01", "S01E02")
    )
    CharacterItem(character = sampleCharacter)
}
