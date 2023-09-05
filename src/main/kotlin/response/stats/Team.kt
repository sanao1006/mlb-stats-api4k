package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "id")
    val id: Int, // 135
    @Json(name = "link")
    val link: String, // /api/v1/teams/135
    @Json(name = "name")
    val name: String // San Diego Padres
)