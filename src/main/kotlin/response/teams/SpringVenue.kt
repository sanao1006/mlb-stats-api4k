package response.teams


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SpringVenue(
    @Json(name = "id")
    val id: Int, // 2500
    @Json(name = "link")
    val link: String // /api/v1/venues/2500
)