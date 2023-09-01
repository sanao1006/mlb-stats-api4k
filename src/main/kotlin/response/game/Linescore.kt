package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Linescore(
    @Json(name = "balls")
    val balls: Int, // 1
    @Json(name = "currentInning")
    val currentInning: Int, // 9
    @Json(name = "currentInningOrdinal")
    val currentInningOrdinal: String, // 9th
    @Json(name = "defense")
    val defense: Defense,
    @Json(name = "inningHalf")
    val inningHalf: String, // Bottom
    @Json(name = "inningState")
    val inningState: String, // Bottom
    @Json(name = "innings")
    val innings: List<Inning>,
    @Json(name = "isTopInning")
    val isTopInning: Boolean, // false
    @Json(name = "offense")
    val offense: Offense,
    @Json(name = "outs")
    val outs: Int, // 3
    @Json(name = "scheduledInnings")
    val scheduledInnings: Int, // 9
    @Json(name = "strikes")
    val strikes: Int, // 2
    @Json(name = "teams")
    val teams: Teams
)