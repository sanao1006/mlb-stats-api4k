package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Game(
    @Json(name = "calendarEventID")
    val calendarEventID: String,
    @Json(name = "content")
    val content: Content,
    @Json(name = "dayNight")
    val dayNight: String,
    @Json(name = "doubleHeader")
    val doubleHeader: String,
    @Json(name = "gameDate")
    val gameDate: String,
    @Json(name = "gameGuid")
    val gameGuid: String,
    @Json(name = "gameNumber")
    val gameNumber: Int,
    @Json(name = "gamePk")
    val gamePk: Int,
    @Json(name = "gameType")
    val gameType: String,
    @Json(name = "gamedayType")
    val gamedayType: String,
    @Json(name = "gamesInSeries")
    val gamesInSeries: Int,
    @Json(name = "ifNecessary")
    val ifNecessary: String,
    @Json(name = "ifNecessaryDescription")
    val ifNecessaryDescription: String,
    @Json(name = "inningBreakLength")
    val inningBreakLength: Int,
    @Json(name = "isTie")
    val isTie: Boolean,
    @Json(name = "link")
    val link: String,
    @Json(name = "officialDate")
    val officialDate: String,
    @Json(name = "publicFacing")
    val publicFacing: Boolean,
    @Json(name = "recordSource")
    val recordSource: String,
    @Json(name = "reverseHomeAwayStatus")
    val reverseHomeAwayStatus: Boolean,
    @Json(name = "scheduledInnings")
    val scheduledInnings: Int,
    @Json(name = "season")
    val season: String,
    @Json(name = "seasonDisplay")
    val seasonDisplay: String,
    @Json(name = "seriesDescription")
    val seriesDescription: String,
    @Json(name = "seriesGameNumber")
    val seriesGameNumber: Int,
    @Json(name = "status")
    val status: Status,
    @Json(name = "teams")
    val teams: Teams,
    @Json(name = "tiebreaker")
    val tiebreaker: String,
    @Json(name = "venue")
    val venue: Venue
)