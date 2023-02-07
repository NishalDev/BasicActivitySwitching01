package com.example.basicactivityswitching01.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicactivityswitching01.Model.Images
import com.example.basicactivityswitching01.R
import com.example.basicactivityswitching01.Utilities.EXTRA_IMAGE

class ImageDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_details)

        val image = intent.getParcelableExtra<Images>(EXTRA_IMAGE)


    }
}