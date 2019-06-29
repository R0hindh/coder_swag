package com.rohindh.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rohindh.coderswag.R
import com.rohindh.coderswag.model.Category

class RecyclerAdapter(val context: Context, val categories  : List<Category>,val itemClicked : (Category) -> Unit): RecyclerView.Adapter<RecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_view_layout,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return  categories.count()
    }

    override fun onBindViewHolder(Holder: Holder, position: Int) {
        Holder.bindHolder(context,categories[position])
    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)
         fun bindHolder ( context: Context, category: Category){
             val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
             categoryImage.setImageResource(resourceId)
             categoryName.text = category.title
             itemView.setOnClickListener { itemClicked(category)}
         }
    }
}