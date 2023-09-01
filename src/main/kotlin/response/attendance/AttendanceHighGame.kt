package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AttendanceHighGame(
    @Json(name = "content")
    val content: Content,
    @Json(name = "dayNight")
    val dayNight: String, // day
    @Json(name = "gamePk")
    val gamePk: Int, // 324707
    @Json(name = "link")
    val link: String // /api/v1.1/game/324707/feed/live
)