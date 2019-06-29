package com.rohindh.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rohindh.coderswag.R
import com.rohindh.coderswag.adapter.RecyclerAdapter
import com.rohindh.coderswag.services.Data
import com.rohindh.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = RecyclerAdapter(this, Data.categories){category ->
            val productIntent = Intent(this,ProductActivity ::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter
        val layoutManager =  LinearLayoutManager (this)
        categoryListView.layoutManager= layoutManager
        categoryListView.setHasFixedSize(true)



    }

}
