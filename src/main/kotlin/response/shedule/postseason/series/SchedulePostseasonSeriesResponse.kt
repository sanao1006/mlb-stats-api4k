package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SchedulePostseasonSeriesResponse(
    @Json(name = "copyright")
    val copyright: String, // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
    @Json(name = "series")
    val series: List<Sery>,
    @Json(name = "totalEvents")
    val totalEvents: Int, // 0
    @Json(name = "totalGames")
    val totalGames: Int, // 53
    @Json(name = "totalGamesInProgress")
    val totalGamesInProgress: Int, // 0
    @Json(name = "totalItems")
    val totalItems: Int, // 53
    @Json(name = "wait")
    val wait: Int // 10
)