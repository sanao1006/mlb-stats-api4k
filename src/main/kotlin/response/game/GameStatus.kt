package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameStatus(
    @Json(name = "isCurrentBatter")
    val isCurrentBatter: Boolean, // false
    @Json(name = "isCurrentPitcher")
    val isCurrentPitcher: Boolean, // true
    @Json(name = "isOnBench")
    val isOnBench: Boolean, // false
    @Json(name = "isSubstitute")
    val isSubstitute: Boolean // true
)