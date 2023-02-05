package com.example.basicactivityswitching01.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicactivityswitching01.R
import com.example.basicactivityswitching01.Utilities.EXTRA_CATEGORY

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}