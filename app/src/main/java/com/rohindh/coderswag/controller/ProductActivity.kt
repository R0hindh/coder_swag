package com.rohindh.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.rohindh.coderswag.R
import com.rohindh.coderswag.adapter.ProductRecyclerAdapter
import com.rohindh.coderswag.services.Data
import com.rohindh.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adapter: ProductRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryName = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductRecyclerAdapter(this,Data.CategoryType(categoryName))
        productListView.adapter = adapter
        val layoutManager = GridLayoutManager(this,2)
        productListView.layoutManager = layoutManager
    }
}
