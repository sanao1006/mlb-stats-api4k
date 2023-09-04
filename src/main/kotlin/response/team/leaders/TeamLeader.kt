package response.team.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamLeader(
    @Json(name = "gameType")
    val gameType: GameType,
    @Json(name = "leaderCategory")
    val leaderCategory: String, // homeRuns
    @Json(name = "leaders")
    val leaders: List<Leader>,
    @Json(name = "season")
    val season: String, // 2023
    @Json(name = "statGroup")
    val statGroup: String, // hitting
    @Json(name = "team")
    val team: Team,
    @Json(name = "totalSplits")
    val totalSplits: Int // 23
)