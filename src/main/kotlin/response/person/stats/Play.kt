package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Play(
    @Json(name = "count")
    val count: Count,
    @Json(name = "details")
    val details: Details,
    @Json(name = "endTime")
    val endTime: String, // 2012-07-27T00:22:18.000Z
    @Json(name = "hitData")
    val hitData: HitData,
    @Json(name = "index")
    val index: Int, // 3
    @Json(name = "isPitch")
    val isPitch: Boolean, // true
    @Json(name = "pitchData")
    val pitchData: PitchData,
    @Json(name = "pitchNumber")
    val pitchNumber: Int, // 3
    @Json(name = "playId")
    val playId: String, // 03247076-0076-0033-000c-f08cd117d70a
    @Json(name = "startTime")
    val startTime: String, // 2012-07-27T00:21:59.000Z
    @Json(name = "type")
    val type: String // pitch
)