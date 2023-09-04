package response.stats.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "id")
    val id: Int, // 108
    @Json(name = "link")
    val link: String, // /api/v1/teams/108
    @Json(name = "name")
    val name: String // Los Angeles Angels
)