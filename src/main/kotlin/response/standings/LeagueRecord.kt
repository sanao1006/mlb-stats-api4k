package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueRecord(
    @Json(name = "losses")
    val losses: Int?, // 49
    @Json(name = "pct")
    val pct: String?, // .655
    @Json(name = "ties")
    val ties: Int?, // 0
    @Json(name = "wins")
    val wins: Int? // 93
)