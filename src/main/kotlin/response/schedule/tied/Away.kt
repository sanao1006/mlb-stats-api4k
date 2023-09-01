package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Away(
    @Json(name = "leagueRecord")
    val leagueRecord: LeagueRecord,
    @Json(name = "score")
    val score: Int,
    @Json(name = "seriesNumber")
    val seriesNumber: Int,
    @Json(name = "splitSquad")
    val splitSquad: Boolean,
    @Json(name = "team")
    val team: Team
)