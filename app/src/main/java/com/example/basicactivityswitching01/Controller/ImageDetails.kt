package com.example.basicactivityswitching01.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicactivityswitching01.Adapter.ImageDetailsAdapter
import com.example.basicactivityswitching01.Adapter.ImagesAdapter
import com.example.basicactivityswitching01.Model.Images
import com.example.basicactivityswitching01.R
import com.example.basicactivityswitching01.Services.Data
import com.example.basicactivityswitching01.Utilities.EXTRA_IMAGE

class ImageDetails : AppCompatActivity() {
    lateinit var adapter: ImageDetailsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_details)

        val imageType = intent.getStringExtra(EXTRA_IMAGE)

        adapter = ImageDetailsAdapter(this,Data.getImageDetail(imageType))


    }
}