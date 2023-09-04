package response.stats.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueLeader(
    @Json(name = "gameType")
    val gameType: GameType,
    @Json(name = "leaderCategory")
    val leaderCategory: String, // homeRuns
    @Json(name = "leaders")
    val leaders: List<Leader>,
    @Json(name = "statGroup")
    val statGroup: String, // hitting
    @Json(name = "totalSplits")
    val totalSplits: Int // 511
)