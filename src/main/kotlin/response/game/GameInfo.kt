package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameInfo(
    @Json(name = "attendance")
    val attendance: Int, // 5038
    @Json(name = "firstPitch")
    val firstPitch: String, // 2012-07-27T00:08:00.000Z
    @Json(name = "gameDurationMinutes")
    val gameDurationMinutes: Int // 174
)