package response.shedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Game(
    @Json(name = "calendarEventID")
    val calendarEventID: String, // 14-748585-2023-10-03
    @Json(name = "content")
    val content: Content,
    @Json(name = "dayNight")
    val dayNight: String, // day
    @Json(name = "description")
    val description: String, // AL Wild Card Series - 3 vs.6
    @Json(name = "doubleHeader")
    val doubleHeader: String, // N
    @Json(name = "gameDate")
    val gameDate: String, // 2023-10-03T07:33:00Z
    @Json(name = "gameGuid")
    val gameGuid: String, // 35d70226-413a-48aa-bc22-60659bcebbd8
    @Json(name = "gameNumber")
    val gameNumber: Int, // 1
    @Json(name = "gamePk")
    val gamePk: Int, // 748585
    @Json(name = "gameType")
    val gameType: String, // F
    @Json(name = "gamedayType")
    val gamedayType: String, // P
    @Json(name = "gamesInSeries")
    val gamesInSeries: Int, // 3
    @Json(name = "ifNecessary")
    val ifNecessary: String, // N
    @Json(name = "ifNecessaryDescription")
    val ifNecessaryDescription: String, // Normal Game
    @Json(name = "inningBreakLength")
    val inningBreakLength: Int, // 120
    @Json(name = "isFeaturedGame")
    val isFeaturedGame: Boolean, // true
    @Json(name = "link")
    val link: String, // /api/v1.1/game/748585/feed/live
    @Json(name = "officialDate")
    val officialDate: String, // 2023-10-03
    @Json(name = "publicFacing")
    val publicFacing: Boolean, // true
    @Json(name = "recordSource")
    val recordSource: String, // S
    @Json(name = "reverseHomeAwayStatus")
    val reverseHomeAwayStatus: Boolean, // false
    @Json(name = "scheduledInnings")
    val scheduledInnings: Int, // 9
    @Json(name = "season")
    val season: String, // 2023
    @Json(name = "seasonDisplay")
    val seasonDisplay: String, // 2023
    @Json(name = "seriesDescription")
    val seriesDescription: String, // Wild Card Game
    @Json(name = "seriesGameNumber")
    val seriesGameNumber: Int, // 1
    @Json(name = "status")
    val status: Status,
    @Json(name = "teams")
    val teams: Teams,
    @Json(name = "tiebreaker")
    val tiebreaker: String, // N
    @Json(name = "venue")
    val venue: Venue
)