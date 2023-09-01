package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Field(
    @Json(name = "label")
    val label: String, // 2B
    @Json(name = "value")
    val value: String // Prince (18, Corcino).
)