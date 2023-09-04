package response.team.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Leader(
    @Json(name = "league")
    val league: League,
    @Json(name = "person")
    val person: Person,
    @Json(name = "rank")
    val rank: Int, // 1
    @Json(name = "season")
    val season: String, // 2023
    @Json(name = "sport")
    val sport: Sport,
    @Json(name = "team")
    val team: Team,
    @Json(name = "value")
    val value: String // 44
)