package response.schedule.postseason


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Home(
    @Json(name = "leagueRecord")
    val leagueRecord: LeagueRecord,
    @Json(name = "seriesNumber")
    val seriesNumber: Int,
    @Json(name = "splitSquad")
    val splitSquad: Boolean,
    @Json(name = "team")
    val team: Team
)