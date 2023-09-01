package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Splits(
    @Json(name = "batter")
    val batter: String, // vs_RHP
    @Json(name = "menOnBase")
    val menOnBase: String, // Empty
    @Json(name = "pitcher")
    val pitcher: String // vs_RHB
)