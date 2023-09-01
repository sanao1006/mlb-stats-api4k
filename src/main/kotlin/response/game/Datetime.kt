package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Datetime(
    @Json(name = "ampm")
    val ampm: String, // PM
    @Json(name = "dateTime")
    val dateTime: String, // 2012-07-27T00:00:00Z
    @Json(name = "dayNight")
    val dayNight: String, // night
    @Json(name = "officialDate")
    val officialDate: String, // 2012-07-26
    @Json(name = "originalDate")
    val originalDate: String, // 2012-07-26
    @Json(name = "time")
    val time: String // 7:00
)