package response.sports.players


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrentTeam(
    @Json(name = "id")
    val id: Int?, // 115
    @Json(name = "link")
    val link: String?, // /api/v1/teams/115
    @Json(name = "name")
    val name: String? // Colorado Rockies
)