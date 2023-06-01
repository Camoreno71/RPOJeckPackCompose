package com.example.plan_lector.navigate

sealed class Route(val route:String) {
    object Index:Route("index")
    object Screen2:Route("Tecnologías")
    object Screen3:Route("Juegos")
    object Screen4:Route("Películas")
    object Detail:Route("detail/{id}"){
        fun showDetail(id:Int)= "detail/$id"
    }
}

