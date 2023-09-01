package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Game(
    @Json(name = "calendarEventID")
    val calendarEventID: String, // 44-324707-2012-07-26
    @Json(name = "doubleHeader")
    val doubleHeader: String, // N
    @Json(name = "gameNumber")
    val gameNumber: Int, // 1
    @Json(name = "gamedayType")
    val gamedayType: String, // Y
    @Json(name = "id")
    val id: String, // 2012/07/26/hunaax-penaax-1
    @Json(name = "pk")
    val pk: Int, // 324707
    @Json(name = "season")
    val season: String, // 2012
    @Json(name = "seasonDisplay")
    val seasonDisplay: String, // 2012
    @Json(name = "tiebreaker")
    val tiebreaker: String, // N
    @Json(name = "type")
    val type: String // R
)