package com.example.plan_lector.navigate

sealed class Route(val route:String) {
    object Index:Route("index")
    object Screen2:Route("screen2")
    object Screen3:Route("screen3")
    object Screen4:Route("screen4")
    object Detail:Route("detail/{id}"){
        fun showDetail(id:Int)= "detail/$id"
    }
}

