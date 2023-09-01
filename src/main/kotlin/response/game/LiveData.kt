package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LiveData(
    @Json(name = "boxscore")
    val boxscore: Boxscore,
    @Json(name = "decisions")
    val decisions: Decisions,
    @Json(name = "leaders")
    val leaders: Leaders,
    @Json(name = "linescore")
    val linescore: Linescore,
    @Json(name = "plays")
    val plays: Plays
)