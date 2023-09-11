package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExpectedRecord(
    @Json(name = "losses")
    val losses: Int?, // 50
    @Json(name = "pct")
    val pct: String?, // .648
    @Json(name = "type")
    val type: String?, // xWinLoss
    @Json(name = "wins")
    val wins: Int? // 92
)