package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Record(
    @Json(name = "division")
    val division: Division?,
    @Json(name = "lastUpdated")
    val lastUpdated: String?, // 2023-09-10T23:51:14.343Z
    @Json(name = "league")
    val league: League?,
    @Json(name = "sport")
    val sport: Sport?,
    @Json(name = "standingsType")
    val standingsType: String?, // regularSeason
    @Json(name = "teamRecords")
    val teamRecords: List<TeamRecord>?
)