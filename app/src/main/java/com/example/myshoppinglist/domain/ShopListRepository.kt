package com.example.myshoppinglist.domain

interface ShopListRepository {

    fun addNewItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun removeShopItem(shopItem: ShopItem)

    fun saveShopItem(id: Int)
}