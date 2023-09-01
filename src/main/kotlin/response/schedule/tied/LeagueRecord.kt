package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueRecord(
    @Json(name = "losses")
    val losses: Int,
    @Json(name = "pct")
    val pct: String,
    @Json(name = "wins")
    val wins: Int
)