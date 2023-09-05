package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class League(
    @Json(name = "id")
    val id: Int, // 104
    @Json(name = "link")
    val link: String, // /api/v1/league/104
    @Json(name = "name")
    val name: String // NL
)