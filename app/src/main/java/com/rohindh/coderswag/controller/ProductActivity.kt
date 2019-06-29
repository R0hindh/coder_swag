package com.rohindh.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohindh.coderswag.R
import com.rohindh.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryName = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryName)
    }
}
