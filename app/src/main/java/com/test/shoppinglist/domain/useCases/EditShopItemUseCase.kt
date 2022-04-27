package com.test.shoppinglist.domain.useCases

import com.test.shoppinglist.domain.ShopListRepository
import com.test.shoppinglist.domain.model.ShopItem

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}