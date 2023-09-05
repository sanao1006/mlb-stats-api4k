package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stat(
    @Json(name = "airOuts")
    val airOuts: Int?, // 125
    @Json(name = "atBats")
    val atBats: Int?, // 551
    @Json(name = "avg")
    val avg: String?, // .191
    @Json(name = "balks")
    val balks: Int?, // 2
    @Json(name = "baseOnBalls")
    val baseOnBalls: Int?, // 89
    @Json(name = "battersFaced")
    val battersFaced: Int?, // 646
    @Json(name = "blownSaves")
    val blownSaves: Int?, // 0
    @Json(name = "catchersInterference")
    val catchersInterference: Int?, // 1
    @Json(name = "caughtStealing")
    val caughtStealing: Int?, // 1
    @Json(name = "completeGames")
    val completeGames: Int?, // 0
    @Json(name = "doubles")
    val doubles: Int?, // 19
    @Json(name = "earnedRuns")
    val earnedRuns: Int?, // 43
    @Json(name = "era")
    val era: String?, // 2.50
    @Json(name = "gamesFinished")
    val gamesFinished: Int?, // 0
    @Json(name = "gamesPitched")
    val gamesPitched: Int?, // 28
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int?, // 28
    @Json(name = "gamesStarted")
    val gamesStarted: Int?, // 28
    @Json(name = "groundIntoDoublePlay")
    val groundIntoDoublePlay: Int?, // 13
    @Json(name = "groundOuts")
    val groundOuts: Int?, // 123
    @Json(name = "groundOutsToAirouts")
    val groundOutsToAirouts: String?, // 0.98
    @Json(name = "hitBatsmen")
    val hitBatsmen: Int?, // 2
    @Json(name = "hitByPitch")
    val hitByPitch: Int?, // 2
    @Json(name = "hits")
    val hits: Int?, // 105
    @Json(name = "hitsPer9Inn")
    val hitsPer9Inn: String?, // 6.10
    @Json(name = "holds")
    val holds: Int?, // 0
    @Json(name = "homeRuns")
    val homeRuns: Int?, // 15
    @Json(name = "homeRunsPer9")
    val homeRunsPer9: String?, // 0.87
    @Json(name = "inheritedRunners")
    val inheritedRunners: Int?, // 0
    @Json(name = "inheritedRunnersScored")
    val inheritedRunnersScored: Int?, // 0
    @Json(name = "inningsPitched")
    val inningsPitched: String?, // 155.0
    @Json(name = "intentionalWalks")
    val intentionalWalks: Int?, // 0
    @Json(name = "losses")
    val losses: Int?, // 9
    @Json(name = "numberOfPitches")
    val numberOfPitches: Int?, // 2770
    @Json(name = "obp")
    val obp: String?, // .304
    @Json(name = "ops")
    val ops: String?, // .611
    @Json(name = "outs")
    val outs: Int?, // 465
    @Json(name = "pickoffs")
    val pickoffs: Int?, // 0
    @Json(name = "pitchesPerInning")
    val pitchesPerInning: String?, // 17.87
    @Json(name = "runs")
    val runs: Int?, // 45
    @Json(name = "runsScoredPer9")
    val runsScoredPer9: String?, // 2.61
    @Json(name = "sacBunts")
    val sacBunts: Int?, // 0
    @Json(name = "sacFlies")
    val sacFlies: Int?, // 3
    @Json(name = "saveOpportunities")
    val saveOpportunities: Int?, // 0
    @Json(name = "saves")
    val saves: Int?, // 0
    @Json(name = "shutouts")
    val shutouts: Int?, // 0
    @Json(name = "slg")
    val slg: String?, // .307
    @Json(name = "stolenBasePercentage")
    val stolenBasePercentage: String?, // .952
    @Json(name = "stolenBases")
    val stolenBases: Int?, // 20
    @Json(name = "strikeOuts")
    val strikeOuts: Int?, // 201
    @Json(name = "strikePercentage")
    val strikePercentage: String?, // .580
    @Json(name = "strikeoutWalkRatio")
    val strikeoutWalkRatio: String?, // 2.26
    @Json(name = "strikeoutsPer9Inn")
    val strikeoutsPer9Inn: String?, // 11.67
    @Json(name = "strikes")
    val strikes: Int?, // 1609
    @Json(name = "totalBases")
    val totalBases: Int?, // 169
    @Json(name = "triples")
    val triples: Int?, // 0
    @Json(name = "walksPer9Inn")
    val walksPer9Inn: String, // 5.17
    @Json(name = "whip")
    val whip: String?, // 1.25
    @Json(name = "wildPitches")
    val wildPitches: Int?, // 12
    @Json(name = "winPercentage")
    val winPercentage: String?, // .571
    @Json(name = "wins")
    val wins: Int?, // 12
    @Json(name = "atBatsPerHomeRun")
    val atBatsPerHomeRun: String?, // 85.67
    @Json(name = "babip")
    val babip: String?, // .370
    @Json(name = "leftOnBase")
    val leftOnBase: Int?, // 149
    @Json(name = "plateAppearances")
    val plateAppearances: Int?, // 556
    @Json(name = "rbi")
    val rbi: Int?, // 61
)