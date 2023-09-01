package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class League(
    @Json(name = "id")
    val id: Int, // 111
    @Json(name = "link")
    val link: String, // /api/v1/league/111
    @Json(name = "name")
    val name: String // Southern League
)