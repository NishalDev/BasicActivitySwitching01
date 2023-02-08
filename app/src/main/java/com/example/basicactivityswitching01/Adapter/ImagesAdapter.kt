package com.example.basicactivityswitching01.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basicactivityswitching01.Model.Images
import com.example.basicactivityswitching01.R

class ImagesAdapter(
    val context: Context,
    val images: List<Images>,
    val itemClick: (Images) -> Unit
) : RecyclerView.Adapter<ImagesAdapter.Holder>() {
    inner class Holder(itemView: View, val itemClick: (Images) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        val imageImage = itemView.findViewById<ImageView>(R.id.imageImage)
        val imageName = itemView.findViewById<TextView>(R.id.imageName)

        fun bindImage(images: Images, context: Context) {
            val resourceId =
                context.resources.getIdentifier(images.images, "drawable", context.packageName)
            imageImage?.setImageResource(resourceId)
            imageName?.text = images.title

            itemView.setOnClickListener { itemClick(images) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.imagelist, parent, false)
        return Holder(view, itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindImage(images[position], context)
    }

    override fun getItemCount(): Int {
        return images.count()
    }
}