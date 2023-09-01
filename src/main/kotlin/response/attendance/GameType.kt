package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameType(
    @Json(name = "description")
    val description: String, // Regular Season
    @Json(name = "id")
    val id: String // R
)