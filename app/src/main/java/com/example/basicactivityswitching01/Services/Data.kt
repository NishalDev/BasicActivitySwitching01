package com.example.basicactivityswitching01.Services


import com.example.basicactivityswitching01.Model.Categories
import com.example.basicactivityswitching01.Model.Images

object Data {
    val categories = listOf(
        Categories("Anime","animeimage"),
        Categories("Nature","naturalimage"),
        Categories("Animal","animalimage")
    )

    val anime = listOf(
        Images("naruto","Naruto"),
        Images("AOT","AOT"),
        Images("JJK","JJK"),
        Images("DemonSlayer","Demon Slayer")
    )

    val nature = listOf(
        Images("tree","Tree"),
        Images("landscape","Landscapes"),
        Images("village","Villages")
    )

    val animal = listOf(
        Images("cat","Cat"),
        Images("dog","Dog"),
        Images("Other","Other")
    )

    fun getImages(category:String?): List<Images>
    {
     return when(category){
         "ANIME" -> anime
         "NATURE" -> nature
         else -> animal
     }
    }
}

