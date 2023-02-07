package com.example.basicactivityswitching01.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basicactivityswitching01.Adapter.ImagesAdapter
import com.example.basicactivityswitching01.R
import com.example.basicactivityswitching01.Services.Data
import com.example.basicactivityswitching01.Utilities.EXTRA_CATEGORY
import com.example.basicactivityswitching01.Utilities.EXTRA_IMAGE
import kotlinx.android.synthetic.main.activity_image.*
import kotlinx.android.synthetic.main.imagelist.view.*

class ImageActivity : AppCompatActivity() {

    lateinit var adapter: ImagesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ImagesAdapter(this,Data.getImages(categoryType)){ images->
            val imageIntent = Intent(this,ImageDetails::class.java)
            imageIntent.putExtra(EXTRA_IMAGE,images.images)
            startActivity(imageIntent)
        }

       val layoutManager = LinearLayoutManager(this)
       imageRecycler.layoutManager = layoutManager
       imageRecycler.adapter = adapter

    }
}