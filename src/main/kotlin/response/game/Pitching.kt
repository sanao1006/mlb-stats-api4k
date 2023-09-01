package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pitching(
    @Json(name = "airOuts")
    val airOuts: Int, // 16
    @Json(name = "atBats")
    val atBats: Int, // 107
    @Json(name = "balks")
    val balks: Int, // 0
    @Json(name = "balls")
    val balls: Int, // 163
    @Json(name = "baseOnBalls")
    val baseOnBalls: Int, // 9
    @Json(name = "battersFaced")
    val battersFaced: Int, // 120
    @Json(name = "blownSaves")
    val blownSaves: Int, // 1
    @Json(name = "catchersInterference")
    val catchersInterference: Int, // 0
    @Json(name = "caughtStealing")
    val caughtStealing: Int, // 2
    @Json(name = "completeGames")
    val completeGames: Int, // 0
    @Json(name = "doubles")
    val doubles: Int, // 7
    @Json(name = "earnedRuns")
    val earnedRuns: Int, // 11
    @Json(name = "era")
    val era: String, // 3.34
    @Json(name = "flyOuts")
    val flyOuts: Int, // 1
    @Json(name = "gamesFinished")
    val gamesFinished: Int, // 16
    @Json(name = "gamesPitched")
    val gamesPitched: Int, // 25
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int, // 25
    @Json(name = "gamesStarted")
    val gamesStarted: Int, // 0
    @Json(name = "groundOuts")
    val groundOuts: Int, // 47
    @Json(name = "groundOutsToAirouts")
    val groundOutsToAirouts: String, // 2.94
    @Json(name = "hitBatsmen")
    val hitBatsmen: Int, // 2
    @Json(name = "hitByPitch")
    val hitByPitch: Int, // 2
    @Json(name = "hits")
    val hits: Int, // 29
    @Json(name = "hitsPer9Inn")
    val hitsPer9Inn: String, // 8.80
    @Json(name = "holds")
    val holds: Int, // 2
    @Json(name = "homeRuns")
    val homeRuns: Int, // 1
    @Json(name = "homeRunsPer9")
    val homeRunsPer9: String, // 0.30
    @Json(name = "inheritedRunners")
    val inheritedRunners: Int, // 7
    @Json(name = "inheritedRunnersScored")
    val inheritedRunnersScored: Int, // 4
    @Json(name = "inningsPitched")
    val inningsPitched: String, // 29.2
    @Json(name = "intentionalWalks")
    val intentionalWalks: Int, // 3
    @Json(name = "losses")
    val losses: Int, // 2
    @Json(name = "numberOfPitches")
    val numberOfPitches: Int, // 435
    @Json(name = "obp")
    val obp: String, // .336
    @Json(name = "outs")
    val outs: Int, // 89
    @Json(name = "passedBall")
    val passedBall: Int, // 0
    @Json(name = "pickoffs")
    val pickoffs: Int, // 1
    @Json(name = "pitchesPerInning")
    val pitchesPerInning: String, // 14.66
    @Json(name = "pitchesThrown")
    val pitchesThrown: Int, // 435
    @Json(name = "rbi")
    val rbi: Int, // 0
    @Json(name = "runs")
    val runs: Int, // 13
    @Json(name = "runsScoredPer9")
    val runsScoredPer9: String, // 3.94
    @Json(name = "sacBunts")
    val sacBunts: Int, // 1
    @Json(name = "sacFlies")
    val sacFlies: Int, // 1
    @Json(name = "saveOpportunities")
    val saveOpportunities: Int, // 6
    @Json(name = "saves")
    val saves: Int, // 5
    @Json(name = "shutouts")
    val shutouts: Int, // 0
    @Json(name = "stolenBasePercentage")
    val stolenBasePercentage: String, // .333
    @Json(name = "stolenBases")
    val stolenBases: Int, // 1
    @Json(name = "strikeOuts")
    val strikeOuts: Int, // 17
    @Json(name = "strikePercentage")
    val strikePercentage: String, // .630
    @Json(name = "strikeoutWalkRatio")
    val strikeoutWalkRatio: String, // 1.89
    @Json(name = "strikeoutsPer9Inn")
    val strikeoutsPer9Inn: String, // 5.16
    @Json(name = "strikes")
    val strikes: Int, // 272
    @Json(name = "triples")
    val triples: Int, // 1
    @Json(name = "walksPer9Inn")
    val walksPer9Inn: String, // 2.73
    @Json(name = "whip")
    val whip: String, // 1.28
    @Json(name = "wildPitches")
    val wildPitches: Int, // 2
    @Json(name = "winPercentage")
    val winPercentage: String, // .000
    @Json(name = "wins")
    val wins: Int // 0
)