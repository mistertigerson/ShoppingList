package com.test.shoppinglist.domain.useCases

import com.test.shoppinglist.domain.ShopListRepository
import com.test.shoppinglist.domain.model.ShopItem

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId : Int) : ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}