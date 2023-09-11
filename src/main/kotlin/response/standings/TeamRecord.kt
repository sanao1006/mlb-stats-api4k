package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamRecord(
    @Json(name = "clinchIndicator")
    val clinchIndicator: String?, // x
    @Json(name = "clinched")
    val clinched: Boolean?, // true
    @Json(name = "conferenceGamesBack")
    val conferenceGamesBack: String?, // -
    @Json(name = "divisionChamp")
    val divisionChamp: Boolean?, // false
    @Json(name = "divisionGamesBack")
    val divisionGamesBack: String?, // -
    @Json(name = "divisionLeader")
    val divisionLeader: Boolean?, // true
    @Json(name = "divisionRank")
    val divisionRank: String?, // 1
    @Json(name = "eliminationNumber")
    val eliminationNumber: String?, // -
    @Json(name = "eliminationNumberConference")
    val eliminationNumberConference: String?, // -
    @Json(name = "eliminationNumberDivision")
    val eliminationNumberDivision: String?, // -
    @Json(name = "eliminationNumberLeague")
    val eliminationNumberLeague: String?, // -
    @Json(name = "eliminationNumberSport")
    val eliminationNumberSport: String?, // -
    @Json(name = "gamesBack")
    val gamesBack: String?, // -
    @Json(name = "gamesPlayed")
    val gamesPlayed: Int?, // 142
    @Json(name = "hasWildcard")
    val hasWildcard: Boolean?, // true
    @Json(name = "lastUpdated")
    val lastUpdated: String?, // 2023-09-10T20:05:20Z
    @Json(name = "leagueGamesBack")
    val leagueGamesBack: String?, // -
    @Json(name = "leagueRank")
    val leagueRank: String?, // 1
    @Json(name = "leagueRecord")
    val leagueRecord: LeagueRecord?,
    @Json(name = "losses")
    val losses: Int?, // 49
    @Json(name = "magicNumber")
    val magicNumber: String?, // -
    @Json(name = "records")
    val records: Records?,
    @Json(name = "runDifferential")
    val runDifferential: Int?, // 238
    @Json(name = "runsAllowed")
    val runsAllowed: Int?, // 588
    @Json(name = "runsScored")
    val runsScored: Int?, // 826
    @Json(name = "season")
    val season: String?, // 2023
    @Json(name = "sportGamesBack")
    val sportGamesBack: String?, // -
    @Json(name = "sportRank")
    val sportRank: String?, // 1
    @Json(name = "springLeagueGamesBack")
    val springLeagueGamesBack: String?, // -
    @Json(name = "streak")
    val streak: Streak?,
    @Json(name = "team")
    val team: Team?,
    @Json(name = "wildCardEliminationNumber")
    val wildCardEliminationNumber: String?, // -
    @Json(name = "wildCardGamesBack")
    val wildCardGamesBack: String?, // -
    @Json(name = "wildCardLeader")
    val wildCardLeader: Boolean?, // true
    @Json(name = "wildCardRank")
    val wildCardRank: String?, // 1
    @Json(name = "winningPercentage")
    val winningPercentage: String?, // .655
    @Json(name = "wins")
    val wins: Int? // 93
)