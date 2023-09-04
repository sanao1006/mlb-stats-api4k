package response.stats.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class League(
    @Json(name = "id")
    val id: Int, // 103
    @Json(name = "link")
    val link: String, // /api/v1/league/103
    @Json(name = "name")
    val name: String // AL
)