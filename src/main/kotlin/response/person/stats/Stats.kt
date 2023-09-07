package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stats(
    @Json(name = "assists")
    val assists: Int?, // 0
    @Json(name = "atBats")
    val atBats: Int?, // 4
    @Json(name = "atBatsPerHomeRun")
    val atBatsPerHomeRun: String?, // -.--
    @Json(name = "baseOnBalls")
    val baseOnBalls: Int?, // 0
    @Json(name = "catchersInterference")
    val catchersInterference: Int?, // 0
    @Json(name = "caughtStealing")
    val caughtStealing: Int?, // 0
    @Json(name = "chances")
    val chances: Int?, // 6
    @Json(name = "doubles")
    val doubles: Int?, // 0
    @Json(name = "errors")
    val errors: Int?, // 0
    @Json(name = "fielding")
    val fielding: String?, // .000
    @Json(name = "flyOuts")
    val flyOuts: Int?, // 0
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int?, // 1
    @Json(name = "gamesStarted")
    val gamesStarted: Int?, // 1
    @Json(name = "groundIntoDoublePlay")
    val groundIntoDoublePlay: Int?, // 0
    @Json(name = "groundIntoTriplePlay")
    val groundIntoTriplePlay: Int?, // 0
    @Json(name = "groundOuts")
    val groundOuts: Int?, // 3
    @Json(name = "hitByPitch")
    val hitByPitch: Int?, // 0
    @Json(name = "hits")
    val hits: Int?, // 1
    @Json(name = "homeRuns")
    val homeRuns: Int?, // 0
    @Json(name = "intentionalWalks")
    val intentionalWalks: Int?, // 0
    @Json(name = "leftOnBase")
    val leftOnBase: Int?, // 2
    @Json(name = "passedBall")
    val passedBall: Int?, // 0
    @Json(name = "pickoffs")
    val pickoffs: Int?, // 0
    @Json(name = "plateAppearances")
    val plateAppearances: Int?, // 4
    @Json(name = "play")
    val play: Play?,
    @Json(name = "putOuts")
    val putOuts: Int?, // 6
    @Json(name = "rbi")
    val rbi: Int?, // 0
    @Json(name = "runs")
    val runs: Int?, // 0
    @Json(name = "sacBunts")
    val sacBunts: Int?, // 0
    @Json(name = "sacFlies")
    val sacFlies: Int?, // 0
    @Json(name = "stolenBasePercentage")
    val stolenBasePercentage: String?, // .---
    @Json(name = "stolenBases")
    val stolenBases: Int?, // 0
    @Json(name = "strikeOuts")
    val strikeOuts: Int?, // 0
    @Json(name = "summary")
    val summary: String?, // 1-4
    @Json(name = "totalBases")
    val totalBases: Int?, // 1
    @Json(name = "triples")
    val triples: Int? // 0
)