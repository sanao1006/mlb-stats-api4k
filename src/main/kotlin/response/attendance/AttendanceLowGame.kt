package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AttendanceLowGame(
    @Json(name = "content")
    val content: Content,
    @Json(name = "dayNight")
    val dayNight: String, // day
    @Json(name = "gamePk")
    val gamePk: Int, // 322099
    @Json(name = "link")
    val link: String // /api/v1.1/game/322099/feed/live
)