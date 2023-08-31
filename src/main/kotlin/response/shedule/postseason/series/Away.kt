package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Away(
    @Json(name = "leagueRecord")
    val leagueRecord: LeagueRecord,
    @Json(name = "seriesNumber")
    val seriesNumber: Int, // 1
    @Json(name = "splitSquad")
    val splitSquad: Boolean, // false
    @Json(name = "team")
    val team: Team
)