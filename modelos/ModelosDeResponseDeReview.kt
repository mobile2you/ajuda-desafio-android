/**
 * Modelos de response do endpoint de reviews
 */


data class ResponseDaReview(
    val results: List<ItemDaListaDeReview>
)

data class ItemDaListaDeReview(
    val author: String?,
    val content: String?
)