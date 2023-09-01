package response.teams


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SpringLeague(
    @Json(name = "abbreviation")
    val abbreviation: String, // CL
    @Json(name = "id")
    val id: Int, // 114
    @Json(name = "link")
    val link: String, // /api/v1/league/114
    @Json(name = "name")
    val name: String // Cactus League
)