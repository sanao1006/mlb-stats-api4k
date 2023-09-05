package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Split(
    @Json(name = "league")
    val league: League,
    @Json(name = "numTeams")
    val numTeams: Int, // 1
    @Json(name = "player")
    val player: Player,
    @Json(name = "position")
    val position: Position,
    @Json(name = "rank")
    val rank: Int, // 1
    @Json(name = "season")
    val season: String, // 2023
    @Json(name = "sport")
    val sport: Sport,
    @Json(name = "stat")
    val stat: Stat,
    @Json(name = "team")
    val team: Team
)