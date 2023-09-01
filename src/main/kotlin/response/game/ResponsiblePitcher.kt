package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponsiblePitcher(
    @Json(name = "id")
    val id: Int, // 502139
    @Json(name = "link")
    val link: String // /api/v1/people/502139
)