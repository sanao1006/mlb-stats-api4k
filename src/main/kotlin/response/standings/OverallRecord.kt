package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OverallRecord(
    @Json(name = "losses")
    val losses: Int?, // 25
    @Json(name = "pct")
    val pct: String?, // .653
    @Json(name = "type")
    val type: String?, // home
    @Json(name = "wins")
    val wins: Int? // 47
)