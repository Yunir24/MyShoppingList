package com.example.myshoppinglist.domain

data class ShopItem(
    val id: Int,
    val name: String,
    var count: Int,
    var enabled: Boolean)
