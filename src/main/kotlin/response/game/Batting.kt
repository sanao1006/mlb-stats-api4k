package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Batting(
    @Json(name = "atBats")
    val atBats: Int, // 0
    @Json(name = "atBatsPerHomeRun")
    val atBatsPerHomeRun: String, // -.--
    @Json(name = "avg")
    val avg: String, // .000
    @Json(name = "babip")
    val babip: String, // .---
    @Json(name = "baseOnBalls")
    val baseOnBalls: Int, // 0
    @Json(name = "catchersInterference")
    val catchersInterference: Int, // 0
    @Json(name = "caughtStealing")
    val caughtStealing: Int, // 0
    @Json(name = "doubles")
    val doubles: Int, // 0
    @Json(name = "flyOuts")
    val flyOuts: Int, // 0
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int, // 15
    @Json(name = "groundIntoDoublePlay")
    val groundIntoDoublePlay: Int, // 0
    @Json(name = "groundIntoTriplePlay")
    val groundIntoTriplePlay: Int, // 0
    @Json(name = "groundOuts")
    val groundOuts: Int, // 0
    @Json(name = "hitByPitch")
    val hitByPitch: Int, // 0
    @Json(name = "hits")
    val hits: Int, // 0
    @Json(name = "homeRuns")
    val homeRuns: Int, // 0
    @Json(name = "intentionalWalks")
    val intentionalWalks: Int, // 0
    @Json(name = "leftOnBase")
    val leftOnBase: Int, // 0
    @Json(name = "obp")
    val obp: String, // .000
    @Json(name = "ops")
    val ops: String, // .000
    @Json(name = "pickoffs")
    val pickoffs: Int, // 0
    @Json(name = "plateAppearances")
    val plateAppearances: Int, // 0
    @Json(name = "rbi")
    val rbi: Int, // 0
    @Json(name = "runs")
    val runs: Int, // 0
    @Json(name = "sacBunts")
    val sacBunts: Int, // 0
    @Json(name = "sacFlies")
    val sacFlies: Int, // 0
    @Json(name = "slg")
    val slg: String, // .000
    @Json(name = "stolenBasePercentage")
    val stolenBasePercentage: String, // .---
    @Json(name = "stolenBases")
    val stolenBases: Int, // 0
    @Json(name = "strikeOuts")
    val strikeOuts: Int, // 0
    @Json(name = "totalBases")
    val totalBases: Int, // 0
    @Json(name = "triples")
    val triples: Int // 0
)