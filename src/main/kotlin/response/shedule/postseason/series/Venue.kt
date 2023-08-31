package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Venue(
    @Json(name = "id")
    val id: Int, // 3832
    @Json(name = "link")
    val link: String, // /api/v1/venues/3832
    @Json(name = "name")
    val name: String // AL Stadium
)