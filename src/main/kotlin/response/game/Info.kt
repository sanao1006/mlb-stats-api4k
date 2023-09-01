package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Info(
    @Json(name = "label")
    val label: String, // WP
    @Json(name = "value")
    val value: String? // Partch 2.
)