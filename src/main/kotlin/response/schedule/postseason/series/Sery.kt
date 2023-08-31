package response.schedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sery(
    @Json(name = "games")
    val games: List<Game>,
    @Json(name = "series")
    val series: Series,
    @Json(name = "sortOrder")
    val sortOrder: Int, // 1
    @Json(name = "totalGames")
    val totalGames: Int, // 3
    @Json(name = "totalGamesInProgress")
    val totalGamesInProgress: Int, // 0
    @Json(name = "totalItems")
    val totalItems: Int // 3
)