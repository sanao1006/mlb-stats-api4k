package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Flags(
    @Json(name = "awayTeamNoHitter")
    val awayTeamNoHitter: Boolean, // false
    @Json(name = "awayTeamPerfectGame")
    val awayTeamPerfectGame: Boolean, // false
    @Json(name = "homeTeamNoHitter")
    val homeTeamNoHitter: Boolean, // false
    @Json(name = "homeTeamPerfectGame")
    val homeTeamPerfectGame: Boolean, // false
    @Json(name = "noHitter")
    val noHitter: Boolean, // false
    @Json(name = "perfectGame")
    val perfectGame: Boolean // false
)