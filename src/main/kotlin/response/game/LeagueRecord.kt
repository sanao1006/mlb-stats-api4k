package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueRecord(
    @Json(name = "losses")
    val losses: Int, // 52
    @Json(name = "pct")
    val pct: String, // .495
    @Json(name = "ties")
    val ties: Int, // 0
    @Json(name = "wins")
    val wins: Int // 51
)