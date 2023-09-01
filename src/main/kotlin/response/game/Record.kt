package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Record(
    @Json(name = "conferenceGamesBack")
    val conferenceGamesBack: String, // -
    @Json(name = "divisionGamesBack")
    val divisionGamesBack: String, // -
    @Json(name = "divisionLeader")
    val divisionLeader: Boolean, // false
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int, // 103
    @Json(name = "leagueGamesBack")
    val leagueGamesBack: String, // -
    @Json(name = "leagueRecord")
    val leagueRecord: LeagueRecord,
    @Json(name = "losses")
    val losses: Int, // 52
    @Json(name = "records")
    val records: Records?,
    @Json(name = "sportGamesBack")
    val sportGamesBack: String, // -
    @Json(name = "springLeagueGamesBack")
    val springLeagueGamesBack: String, // -
    @Json(name = "wildCardGamesBack")
    val wildCardGamesBack: String, // -
    @Json(name = "winningPercentage")
    val winningPercentage: String, // .495
    @Json(name = "wins")
    val wins: Int // 51
)