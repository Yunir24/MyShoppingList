package com.example.myshoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    //test a new branches in branches
    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }
}