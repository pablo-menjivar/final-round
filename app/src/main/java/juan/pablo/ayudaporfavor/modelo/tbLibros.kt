package juan.pablo.ayudaporfavor.modelo

data class tbLibros (
    val UUID: String,
    var TituloLibro: String,
    var AutorLibro: String,
    var ISBN: String,
    var EditorialLibro: String,
    var AñoPublicacion: Int,
    var GeneroLibro: String,
    var IdiomaLibro: String,
    var PrecioLibro: Number
)
