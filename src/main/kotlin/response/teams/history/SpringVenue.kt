package response.teams.history


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SpringVenue(
    @Json(name = "id")
    val id: Int,
    @Json(name = "link")
    val link: String
)