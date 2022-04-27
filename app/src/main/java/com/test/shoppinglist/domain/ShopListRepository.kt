package com.test.shoppinglist.domain

import com.test.shoppinglist.domain.model.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId : Int) : ShopItem

    fun getShopItemList() : List<ShopItem>
}