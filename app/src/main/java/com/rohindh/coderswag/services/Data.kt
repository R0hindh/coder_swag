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
        Product("King maker dark grape hat","450 Rs","hat01"),
        Product("King maker black hat","550 Rs","hat02"),
        Product("King maker light white hat","650 Rs","hat03"),
        Product("King maker dark brown hat","750 Rs","hat04")
        )
    val shirts = listOf(
        Product("King maker dark grape shirt","550 Rs","shirt01"),
        Product("King maker black shirt","750 Rs","shirt02"),
        Product("King maker light white shirt","1050 Rs","shirt03"),
        Product("King maker dark brown shirt","1550 Rs","shirt04"),
        Product("King maker logo shirt","2550 Rs","shirt05")

    )
    val hoodies = listOf(
        Product("King maker dark grape hoodies","550 Rs","hoodies01"),
        Product("King maker black hoodies","650 Rs","hoodies02"),
        Product("King maker light white hoodies","850 Rs","hoodies03"),
        Product("King maker dark brown hoodies","1550 Rs","hoodies04")
        )

}