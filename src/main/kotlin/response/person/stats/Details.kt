package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Details(
    @Json(name = "awayScore")
    val awayScore: Int, // 0
    @Json(name = "ballColor")
    val ballColor: String, // rgba(26, 86, 190, 1.0)
    @Json(name = "call")
    val call: Call,
    @Json(name = "code")
    val code: String, // X
    @Json(name = "description")
    val description: String, // In play, out(s)
    @Json(name = "hasReview")
    val hasReview: Boolean, // false
    @Json(name = "homeScore")
    val homeScore: Int, // 0
    @Json(name = "isBall")
    val isBall: Boolean, // false
    @Json(name = "isInPlay")
    val isInPlay: Boolean, // true
    @Json(name = "isOut")
    val isOut: Boolean, // true
    @Json(name = "isStrike")
    val isStrike: Boolean // false
)