package com.example.plan_lector.navigate

sealed class Route(val route:String) {
    object Index:Route("index")
    object Screen2:Route("Tecnologías")
    object Screen3:Route("Juegos")
    object Screen4:Route("Películas")
    object Screen5:Route("Musica")
    object Screen6:Route("Lugares")
    object Detail:Route("detail/{id}/{list}"){
        fun showDetail(id:Int, list: String)= "detail/$id/$list"
    }
}

