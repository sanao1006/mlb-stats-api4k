package response.team.roster


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamRosterResponse(
    @Json(name = "copyright")
    val copyright: String, // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
    @Json(name = "link")
    val link: String, // /api/v1/teams/108/roster
    @Json(name = "roster")
    val roster: List<Roster>,
    @Json(name = "rosterType")
    val rosterType: String, // active
    @Json(name = "teamId")
    val teamId: Int // 108
)