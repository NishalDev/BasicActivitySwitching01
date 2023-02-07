package com.example.basicactivityswitching01.Services


import com.example.basicactivityswitching01.Controller.ImageDetails
import com.example.basicactivityswitching01.Model.Categories
import com.example.basicactivityswitching01.Model.ImageImage
import com.example.basicactivityswitching01.Model.Images

object Data {
    val categories = listOf(
        Categories("Anime","animeimage"),
        Categories("Nature","naturalimage"),
        Categories("Animal","animalimage")
    )

    val anime = listOf(
        Images("naruto","Naruto"),
        Images("aot","AOT"),
        Images("jjk","JJK"),
        Images("demonslayer","Demon Slayer")
    )

    val nature = listOf(
        Images("tree","Tree"),
        Images("landscape","Landscapes"),
        Images("village","Villages")
    )

    val animal = listOf(
        Images("cat","Cat"),
        Images("dog","Dog"),
        Images("other","Other")
    )

    val naruto = listOf(
        ImageImage("naruto01"),
        ImageImage("naruto02"),
        ImageImage("naruto03"),
        ImageImage("naruto04")
    )

    val aot = listOf(
        ImageImage("naruto01"),
        ImageImage("naruto02"),
        ImageImage("naruto03"),
        ImageImage("naruto04")
    )
    val jjk = listOf(
        ImageImage("naruto01"),
        ImageImage("naruto02"),
        ImageImage("naruto03"),
        ImageImage("naruto04")
    )
    val demonslayer = listOf(
        ImageImage("naruto01"),
        ImageImage("naruto02"),
        ImageImage("naruto03"),
        ImageImage("naruto04")
    )

    fun getImages(category:String?): List<Images>
    {
     return when(category){
         "Anime" -> anime
         "Nature" -> nature
         else -> animal
     }
    }
    fun getImageDetail(image: String?): List<ImageImage>
    {
        return when(image){
            "Naruto" -> naruto
            "AOT" -> aot
            "JJK" -> jjk
            else -> demonslayer
        }
    }
}

