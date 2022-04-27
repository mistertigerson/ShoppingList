package com.test.shoppinglist.domain.useCases

import com.test.shoppinglist.domain.ShopListRepository
import com.test.shoppinglist.domain.model.ShopItem

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}