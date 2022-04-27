package com.test.shoppinglist.domain.useCases

import com.test.shoppinglist.domain.ShopListRepository
import com.test.shoppinglist.domain.model.ShopItem

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemList() : List<ShopItem>{
        return shopListRepository.getShopItemList()
    }
}