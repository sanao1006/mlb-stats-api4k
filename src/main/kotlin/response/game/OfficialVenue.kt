package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OfficialVenue(
    @Json(name = "id")
    val id: Int, // 4329
    @Json(name = "link")
    val link: String // /api/v1/venues/4329
)