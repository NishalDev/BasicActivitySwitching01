package com.example.basicactivityswitching01.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basicactivityswitching01.Adapter.CategoryRecyclerAdapter
import com.example.basicactivityswitching01.R
import com.example.basicactivityswitching01.Services.Data
import com.example.basicactivityswitching01.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this,Data.categories){
            categories -> val categoryIntent = Intent(this, ImageActivity ::class.java)
            categoryIntent.putExtra(EXTRA_CATEGORY,categories.title)
            startActivity(categoryIntent)
        }
        RecyclerId1.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        RecyclerId1.layoutManager = layoutManager
        RecyclerId1.setHasFixedSize(true)
    }
}