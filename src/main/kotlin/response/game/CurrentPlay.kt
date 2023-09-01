package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrentPlay(
    @Json(name = "about")
    val about: About,
    @Json(name = "actionIndex")
    val actionIndex: List<Any>,
    @Json(name = "atBatIndex")
    val atBatIndex: Int, // 72
    @Json(name = "count")
    val count: Count,
    @Json(name = "matchup")
    val matchup: Matchup,
    @Json(name = "pitchIndex")
    val pitchIndex: List<Int>,
    @Json(name = "playEndTime")
    val playEndTime: String, // 2012-07-27T03:02:09.000Z
    @Json(name = "playEvents")
    val playEvents: List<PlayEvent>,
    @Json(name = "result")
    val result: Result,
    @Json(name = "runnerIndex")
    val runnerIndex: List<Int>,
    @Json(name = "runners")
    val runners: List<Runner>
)