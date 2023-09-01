package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Details(
    @Json(name = "awayScore")
    val awayScore: Int?, // 0
    @Json(name = "ballColor")
    val ballColor: String?, // rgba(39, 161, 39, 1.0)
    @Json(name = "call")
    val call: Call?,
    @Json(name = "code")
    val code: String?, // B
    @Json(name = "description")
    val description: String?, // Ball
    @Json(name = "disengagementNum")
    val disengagementNum: Int?, // 1
    @Json(name = "event")
    val event: String?, // Game Advisory
    @Json(name = "eventType")
    val eventType: String?, // game_advisory
    @Json(name = "fromCatcher")
    val fromCatcher: Boolean?, // false
    @Json(name = "hasReview")
    val hasReview: Boolean?, // false
    @Json(name = "homeScore")
    val homeScore: Int?, // 0
    @Json(name = "isBall")
    val isBall: Boolean?, // true
    @Json(name = "isInPlay")
    val isInPlay: Boolean?, // false
    @Json(name = "isOut")
    val isOut: Boolean?, // false
    @Json(name = "isScoringPlay")
    val isScoringPlay: Boolean?, // false
    @Json(name = "isStrike")
    val isStrike: Boolean?, // false
    @Json(name = "runnerGoing")
    val runnerGoing: Boolean? // true
)