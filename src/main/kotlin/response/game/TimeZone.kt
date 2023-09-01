package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TimeZone(
    @Json(name = "id")
    val id: String, // America/Chicago
    @Json(name = "offset")
    val offset: Int, // -5
    @Json(name = "offsetAtGameTime")
    val offsetAtGameTime: Int, // -5
    @Json(name = "tz")
    val tz: String // CDT
)