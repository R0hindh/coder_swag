package com.rohindh.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.rohindh.coderswag.R
import com.rohindh.coderswag.model.Category
import com.rohindh.coderswag.services.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Data.category)
        categoryListView.adapter = adapter

    }

}
