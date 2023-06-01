package com.example.plan_lector

import androidx.annotation.DrawableRes

data class Item(val id: Int, val name:String, val description:String,val whereAppear:String, @DrawableRes val photo:Int)
