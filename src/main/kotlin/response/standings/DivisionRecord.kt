package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DivisionRecord(
    @Json(name = "division")
    val division: Division?,
    @Json(name = "losses")
    val losses: Int?, // 12
    @Json(name = "pct")
    val pct: String?, // .636
    @Json(name = "wins")
    val wins: Int? // 21
)