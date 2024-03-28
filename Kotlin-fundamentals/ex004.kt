class Song(
    val titulo: String,
    val artista: String,
    val anoPublicado: Int,
    val contagemReproducao: Int
){
    val popular: Boolean
        get() = contagemReproducao >= 1000

    fun mostrarDescricao(){
        println("$titulo, interpretado por $artista, foi lançado em $anoPublicado.")
    }
}