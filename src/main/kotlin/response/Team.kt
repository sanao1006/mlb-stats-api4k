package response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "abbreviation")
    val abbreviation: String?, // PNS
    @Json(name = "active")
    val active: Boolean, // true
    @Json(name = "allStarStatus")
    val allStarStatus: String, // N
    @Json(name = "clubName")
    val clubName: String?, // Blue Wahoos
    @Json(name = "division")
    val division: Division?,
    @Json(name = "fileCode")
    val fileCode: String, // t4124
    @Json(name = "firstYearOfPlay")
    val firstYearOfPlay: String?, // 2012
    @Json(name = "franchiseName")
    val franchiseName: String?, // Pensacola
    @Json(name = "id")
    val id: Int, // 4124
    @Json(name = "league")
    val league: League,
    @Json(name = "link")
    val link: String, // /api/v1/teams/4124
    @Json(name = "locationName")
    val locationName: String?, // Pensacola
    @Json(name = "name")
    val name: String, // Pensacola Blue Wahoos
    @Json(name = "parentOrgId")
    val parentOrgId: Int?, // 146
    @Json(name = "parentOrgName")
    val parentOrgName: String?, // Miami Marlins
    @Json(name = "season")
    val season: Int, // 2023
    @Json(name = "shortName")
    val shortName: String, // Pensacola
    @Json(name = "sport")
    val sport: Sport,
    @Json(name = "springLeague")
    val springLeague: SpringLeague?,
    @Json(name = "springVenue")
    val springVenue: SpringVenue?,
    @Json(name = "teamCode")
    val teamCode: String, // pen
    @Json(name = "teamName")
    val teamName: String, // Blue Wahoos
    @Json(name = "venue")
    val venue: Venue
)