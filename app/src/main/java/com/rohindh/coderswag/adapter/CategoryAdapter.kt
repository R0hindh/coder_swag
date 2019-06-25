package com.rohindh.coderswag.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rohindh.coderswag.R
import com.rohindh.coderswag.model.Category
//import com.rohindh.coderswag.services.Data.category
import org.w3c.dom.Text

//@Suppress("UNREACHABLE_CODE")
class CategoryAdapter(context : Context, categories: List<Category>): BaseAdapter() {
    val categories = categories
    val context = context

//    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryview :View
        categoryview = LayoutInflater.from(context).inflate(R.layout.category_view_layout,null)
        val categoryimage : ImageView = categoryview.findViewById(R.id.categoryImage)
        val categoryname : TextView = categoryview.findViewById(R.id.categoryName)
        val category = categories[position]
        categoryname.text = category.title
        val resourceid = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryimage.setImageResource(resourceid)
        println(resourceid)
        return categoryview
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}