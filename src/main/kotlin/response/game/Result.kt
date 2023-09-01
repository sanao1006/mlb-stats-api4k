package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(
    @Json(name = "awayScore")
    val awayScore: Int, // 0
    @Json(name = "description")
    val description: String, // Josh Prince pops out to second baseman Miguel Rojas.
    @Json(name = "event")
    val event: String, // Pop Out
    @Json(name = "eventType")
    val eventType: String, // field_out
    @Json(name = "homeScore")
    val homeScore: Int, // 0
    @Json(name = "isOut")
    val isOut: Boolean, // true
    @Json(name = "rbi")
    val rbi: Int, // 0
    @Json(name = "type")
    val type: String // atBat
)