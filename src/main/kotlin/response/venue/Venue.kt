package response.venue


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Venue(
    @Json(name = "active")
    val active: Boolean?, // true
    @Json(name = "id")
    val id: Int?, // 5515
    @Json(name = "link")
    val link: String?, // /api/v1/venues/5515
    @Json(name = "name")
    val name: String?, // Colorado Convention Center
    @Json(name = "season")
    val season: String? // 2023
)