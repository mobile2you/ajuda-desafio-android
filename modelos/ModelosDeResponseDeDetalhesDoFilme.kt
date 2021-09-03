/**
 * Modelo de response para o endpoint details
 */

data class ResponseDosDetalhesDoFilme(
    val poster_path: String?,
    val overview: String?,
    val genres: List<Genero>,
    val title: String?,
    val backdrop_path: String?,
    val vote_average: Float?,
    val runtime: Int?
)

data class Genero(
    val name: String?
)