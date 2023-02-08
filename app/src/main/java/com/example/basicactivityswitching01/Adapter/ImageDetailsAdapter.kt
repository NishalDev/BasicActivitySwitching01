package com.example.basicactivityswitching01.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.basicactivityswitching01.Model.ImageImage
import com.example.basicactivityswitching01.Model.Images
import com.example.basicactivityswitching01.R

class ImageDetailsAdapter(val context: Context, val imageDetails: List<ImageImage>) :
    RecyclerView.Adapter<ImageDetailsAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ImageImageID = itemView?.findViewById<ImageView>(R.id.ImageImageID)

        fun bindImageImage(imageImage: ImageImage, context: Context) {
            val resourceId =
                context.resources.getIdentifier(imageImage.images, "drawable", context.packageName)
            ImageImageID?.setImageResource(resourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.image_detail_llist, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindImageImage(imageDetails[position], context)
    }

    override fun getItemCount(): Int {
        return imageDetails.count()
    }
}