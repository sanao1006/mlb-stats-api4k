package response.team.alumni


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatSide(
    @Json(name = "code")
    val code: String, // L
    @Json(name = "description")
    val description: String // Left
)