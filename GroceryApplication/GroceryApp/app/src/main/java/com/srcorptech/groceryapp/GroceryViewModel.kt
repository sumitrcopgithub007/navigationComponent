package com.srcorptech.groceryapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repogitory: GroceryRepogitory):ViewModel() {
    fun insert(items: GroceryItems)=GlobalScope.launch {
        repogitory.insert(items)
    }
    fun delete(items: GroceryItems)=GlobalScope.launch {
        repogitory.delete(items)
    }
    fun  getAllGroceryItems()=repogitory.getAllItems()
}