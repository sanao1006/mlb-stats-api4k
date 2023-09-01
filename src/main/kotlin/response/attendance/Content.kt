package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Content(
    @Json(name = "link")
    val link: String // /api/v1/game/324707/content
)