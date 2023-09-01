package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "id")
    val id: Int, // 4124
    @Json(name = "link")
    val link: String, // /api/v1/teams/4124
    @Json(name = "name")
    val name: String // Pensacola Blue Wahoos
)