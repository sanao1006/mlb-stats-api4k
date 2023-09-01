package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Date(
    @Json(name = "date")
    val date: String,
    @Json(name = "events")
    val events: List<Any>,
    @Json(name = "games")
    val games: List<Game>,
    @Json(name = "totalEvents")
    val totalEvents: Int,
    @Json(name = "totalGames")
    val totalGames: Int,
    @Json(name = "totalGamesInProgress")
    val totalGamesInProgress: Int,
    @Json(name = "totalItems")
    val totalItems: Int
)