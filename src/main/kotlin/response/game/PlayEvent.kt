package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayEvent(
    @Json(name = "actionPlayId")
    val actionPlayId: String?, // 03247076-0326-0013-001c-f08cd117d70a
    @Json(name = "battingOrder")
    val battingOrder: String?, // 901
    @Json(name = "count")
    val count: Count,
    @Json(name = "details")
    val details: Details,
    @Json(name = "endTime")
    val endTime: String, // 2012-07-27T00:08:36.000Z
    @Json(name = "hitData")
    val hitData: HitData?,
    @Json(name = "index")
    val index: Int, // 0
    @Json(name = "isBaseRunningPlay")
    val isBaseRunningPlay: Boolean?, // true
    @Json(name = "isPitch")
    val isPitch: Boolean, // true
    @Json(name = "isSubstitution")
    val isSubstitution: Boolean?, // true
    @Json(name = "pitchData")
    val pitchData: PitchData?,
    @Json(name = "pitchNumber")
    val pitchNumber: Int?, // 1
    @Json(name = "playId")
    val playId: String?, // 03247076-0016-0013-000c-f08cd117d70a
    @Json(name = "player")
    val player: Player?,
    @Json(name = "position")
    val position: Position?,
    @Json(name = "replacedPlayer")
    val replacedPlayer: ReplacedPlayer?,
    @Json(name = "startTime")
    val startTime: String, // 2012-07-27T00:08:28.000Z
    @Json(name = "type")
    val type: String // pitch
)