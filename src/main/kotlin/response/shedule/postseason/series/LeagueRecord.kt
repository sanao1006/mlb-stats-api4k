package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueRecord(
    @Json(name = "losses")
    val losses: Int, // 0
    @Json(name = "pct")
    val pct: String, // .000
    @Json(name = "wins")
    val wins: Int // 0
)