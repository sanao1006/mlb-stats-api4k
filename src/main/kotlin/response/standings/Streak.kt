package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Streak(
    @Json(name = "streakCode")
    val streakCode: String?, // W1
    @Json(name = "streakNumber")
    val streakNumber: Int?, // 1
    @Json(name = "streakType")
    val streakType: String? // wins
)