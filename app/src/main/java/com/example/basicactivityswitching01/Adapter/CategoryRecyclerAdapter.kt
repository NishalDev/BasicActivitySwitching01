package com.example.basicactivityswitching01.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basicactivityswitching01.Model.Categories
import com.example.basicactivityswitching01.R

class CategoryRecyclerAdapter(val context: Context, val categories: List<Categories>, val itemClick: (Categories)-> Unit) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {
    inner class Holder(itemView: View, val itemClick: (Categories) -> Unit) :RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(categories: Categories,context: Context){
            val resourceId = context.resources.getIdentifier(categories.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = categories.title

            itemView.setOnClickListener { itemClick(categories) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list,parent,false)
        return Holder(view, itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    override fun getItemCount(): Int {
       return categories.count()
    }
}