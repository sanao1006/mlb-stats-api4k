package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SeasonStats(
    @Json(name = "batting")
    val batting: Batting,
    @Json(name = "fielding")
    val fielding: Fielding,
    @Json(name = "pitching")
    val pitching: Pitching
)