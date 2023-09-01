package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Fielding(
    @Json(name = "assists")
    val assists: Int, // 8
    @Json(name = "caughtStealing")
    val caughtStealing: Int, // 0
    @Json(name = "chances")
    val chances: Int, // 11
    @Json(name = "errors")
    val errors: Int, // 2
    @Json(name = "fielding")
    val fielding: String, // .818
    @Json(name = "passedBall")
    val passedBall: Int, // 0
    @Json(name = "pickoffs")
    val pickoffs: Int, // 0
    @Json(name = "putOuts")
    val putOuts: Int, // 1
    @Json(name = "stolenBasePercentage")
    val stolenBasePercentage: String, // .---
    @Json(name = "stolenBases")
    val stolenBases: Int // 0
)