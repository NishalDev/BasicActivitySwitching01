package com.example.basicactivityswitching01.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basicactivityswitching01.Model.Images
import com.example.basicactivityswitching01.R

class ImagesAdapter(val context: Context, val images: List<Images>): RecyclerView.Adapter<ImagesAdapter.Holder>() {
    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageImage = itemView.findViewById<R.id.>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

    }

    override fun getItemCount(): Int {
       return  images.count()
    }
}