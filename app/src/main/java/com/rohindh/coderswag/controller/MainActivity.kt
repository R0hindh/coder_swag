package com.rohindh.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rohindh.coderswag.R
import com.rohindh.coderswag.adapter.RecyclerAdapter
import com.rohindh.coderswag.services.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = RecyclerAdapter(this, Data.categories)
        categoryListView.adapter = adapter
        val layoutManager =  LinearLayoutManager (this)
        categoryListView.layoutManager= layoutManager
//        categoryListView.setHasFixedSize(true)



    }

}
