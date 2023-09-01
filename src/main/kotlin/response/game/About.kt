package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class About(
    @Json(name = "atBatIndex")
    val atBatIndex: Int, // 0
    @Json(name = "captivatingIndex")
    val captivatingIndex: Int, // 0
    @Json(name = "endTime")
    val endTime: String, // 2012-07-27T00:09:31.000Z
    @Json(name = "halfInning")
    val halfInning: String, // top
    @Json(name = "hasOut")
    val hasOut: Boolean, // true
    @Json(name = "hasReview")
    val hasReview: Boolean, // false
    @Json(name = "inning")
    val inning: Int, // 1
    @Json(name = "isComplete")
    val isComplete: Boolean, // true
    @Json(name = "isScoringPlay")
    val isScoringPlay: Boolean, // false
    @Json(name = "isTopInning")
    val isTopInning: Boolean, // true
    @Json(name = "startTime")
    val startTime: String // 2012-07-27T00:08:24.000Z
)