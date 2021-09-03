/**
 * Esses modelos servem como response para os endpoints: now_playing, popular, top_rated, upcoming e similar 
 */

data class ResponseDaListaDeFilmes(
    val page: Int?,
    val results: List<ItemDaListaDeFilme>?
)

data class ItemDaListaDeFilme(
    val poster_path: String?,
    val id: Int?
)