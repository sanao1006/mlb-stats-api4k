package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Credit(
    @Json(name = "credit")
    val credit: String, // f_putout
    @Json(name = "player")
    val player: Player,
    @Json(name = "position")
    val position: Position
)