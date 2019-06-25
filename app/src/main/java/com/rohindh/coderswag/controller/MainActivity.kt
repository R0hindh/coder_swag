package com.rohindh.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.rohindh.coderswag.R
import com.rohindh.coderswag.adapter.CategoryAdapter
import com.rohindh.coderswag.model.Category
import com.rohindh.coderswag.services.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this, Data.categories)
        categoryListView.adapter = adapter



    }

}
