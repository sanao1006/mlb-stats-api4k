package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "allStarStatus")
    val allStarStatus: String?, // N
    @Json(name = "id")
    val id: Int, // 559
    @Json(name = "link")
    val link: String, // /api/v1/teams/559
    @Json(name = "name")
    val name: String // Huntsville Stars
)