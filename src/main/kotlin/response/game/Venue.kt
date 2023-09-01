package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Venue(
    @Json(name = "active")
    val active: Boolean?, // true
    @Json(name = "fieldInfo")
    val fieldInfo: FieldInfo?,
    @Json(name = "id")
    val id: Int, // 4329
    @Json(name = "link")
    val link: String, // /api/v1/venues/4329
    @Json(name = "location")
    val location: Location?,
    @Json(name = "name")
    val name: String, // Pensacola Bayfront Stadium
    @Json(name = "season")
    val season: String?, // 2012
    @Json(name = "timeZone")
    val timeZone: TimeZone?
)