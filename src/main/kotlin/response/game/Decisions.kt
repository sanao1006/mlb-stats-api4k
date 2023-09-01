package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Decisions(
    @Json(name = "loser")
    val loser: Loser,
    @Json(name = "save")
    val save: Save,
    @Json(name = "winner")
    val winner: Winner
)