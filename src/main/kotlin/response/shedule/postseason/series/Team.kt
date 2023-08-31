package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "id")
    val id: Int, // 4946
    @Json(name = "link")
    val link: String, // /api/v1/teams/4946
    @Json(name = "name")
    val name: String // AL Wild Card #3
)