package com.example.myshoppinglist.domain

class AddNewItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addNewItem(shopItem: ShopItem){
        shopListRepository.addNewItem(shopItem)
    }
}