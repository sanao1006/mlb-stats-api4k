package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Plays(
    @Json(name = "allPlays")
    val allPlays: List<AllPlay>,
    @Json(name = "currentPlay")
    val currentPlay: CurrentPlay,
    @Json(name = "playsByInning")
    val playsByInning: List<PlaysByInning>,
    @Json(name = "scoringPlays")
    val scoringPlays: List<Int>
)