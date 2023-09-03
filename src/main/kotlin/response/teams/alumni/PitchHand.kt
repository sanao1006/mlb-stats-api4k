package response.teams.alumni


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PitchHand(
    @Json(name = "code")
    val code: String, // L
    @Json(name = "description")
    val description: String // Left
)