package com.test.shoppinglist.domain.useCases

import com.test.shoppinglist.domain.ShopListRepository
import com.test.shoppinglist.domain.model.ShopItem

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}