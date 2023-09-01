package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PitchHand(
    @Json(name = "code")
    val code: String, // R
    @Json(name = "description")
    val description: String // Right
)