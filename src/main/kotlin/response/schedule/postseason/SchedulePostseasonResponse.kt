package response.schedule.postseason


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SchedulePostseasonResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "dates")
    val dates: List<Date>,
    @Json(name = "totalEvents")
    val totalEvents: Int,
    @Json(name = "totalGames")
    val totalGames: Int,
    @Json(name = "totalGamesInProgress")
    val totalGamesInProgress: Int,
    @Json(name = "totalItems")
    val totalItems: Int,
    @Json(name = "wait")
    val wait: Int
)