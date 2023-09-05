package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sport(
    @Json(name = "abbreviation")
    val abbreviation: String, // MLB
    @Json(name = "id")
    val id: Int, // 1
    @Json(name = "link")
    val link: String // /api/v1/sports/1
)