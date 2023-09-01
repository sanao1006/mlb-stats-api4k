package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleTiedResponse(
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
    val totalItems: Int
)