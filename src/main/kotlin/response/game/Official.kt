package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Official(
    @Json(name = "official")
    val official: Official,
    @Json(name = "officialType")
    val officialType: String // Home Plate
)