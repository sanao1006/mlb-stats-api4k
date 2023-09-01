package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameData(
    @Json(name = "alerts")
    val alerts: List<Any>,
    @Json(name = "datetime")
    val datetime: Datetime,
    @Json(name = "flags")
    val flags: Flags,
    @Json(name = "game")
    val game: Game,
    @Json(name = "gameInfo")
    val gameInfo: GameInfo,
    @Json(name = "officialScorer")
    val officialScorer: OfficialScorer,
    @Json(name = "officialVenue")
    val officialVenue: OfficialVenue,
    @Json(name = "players")
    val players: Any,
    @Json(name = "primaryDatacaster")
    val primaryDatacaster: PrimaryDatacaster,
    @Json(name = "probablePitchers")
    val probablePitchers: ProbablePitchers,
    @Json(name = "review")
    val review: Review,
    @Json(name = "status")
    val status: Status,
    @Json(name = "teams")
    val teams: Teams,
    @Json(name = "venue")
    val venue: Venue,
    @Json(name = "weather")
    val weather: Weather
)