package com.example.myshoppinglist.domain

class SaveShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun saveShopItem(id: Int){
        shopListRepository.saveShopItem(id)
    }
}