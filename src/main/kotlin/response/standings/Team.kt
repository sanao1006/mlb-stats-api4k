package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "id")
    val id: Int?, // 144
    @Json(name = "link")
    val link: String?, // /api/v1/teams/144
    @Json(name = "name")
    val name: String? // Atlanta Braves
)