package com.rohindh.coderswag.services

import com.rohindh.coderswag.model.Category
import com.rohindh.coderswag.model.Product

object Data {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage") 
    )

    val hats = listOf(
        Product("King maker dark grape hat","450 Rs","hat1"),
        Product("King maker black hat","550 Rs","hat2"),
        Product("King maker light white hat","650 Rs","hat3"),
        Product("King maker dark brown hat","750 Rs","hat4")
        )
    val shirts = listOf(
        Product("King maker dark grape shirt","550 Rs","shirt1"),
        Product("King maker black shirt","750 Rs","shirt2"),
        Product("King maker light white shirt","1050 Rs","shirt3"),
        Product("King maker dark brown shirt","1550 Rs","shirt4"),
        Product("King maker logo shirt","2550 Rs","shirt5")
    )
    val hoodies = listOf(
        Product("King maker dark grape hoodies","550 Rs","hoodie1"),
        Product("King maker black hoodies","650 Rs","hoodie2"),
        Product("King maker light white hoodies","850 Rs","hoodie3"),
        Product("King maker dark brown hoodies","1550 Rs","hoodie4")
    )
    val digital = listOf<Product>()
    fun CategoryType (category: String): List<Product>{
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digital
        }
    }
}