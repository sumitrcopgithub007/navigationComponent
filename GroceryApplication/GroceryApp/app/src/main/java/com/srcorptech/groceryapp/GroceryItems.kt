package com.srcorptech.groceryapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocery_items")
data class GroceryItems (
    @ColumnInfo(name = "itemsName")
    var itemNames:String,

    @ColumnInfo(name ="itemQuantity" )
    var itemQuantity:Int,

     @ColumnInfo(name = "itemPrice")
     var itemPrice:Int,
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}