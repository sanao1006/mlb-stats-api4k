package response.team


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "abbreviation")
    val abbreviation: String,
    @Json(name = "active")
    val active: Boolean,
    @Json(name = "allStarStatus")
    val allStarStatus: String,
    @Json(name = "clubName")
    val clubName: String,
    @Json(name = "division")
    val division: Division,
    @Json(name = "fileCode")
    val fileCode: String,
    @Json(name = "firstYearOfPlay")
    val firstYearOfPlay: String,
    @Json(name = "franchiseName")
    val franchiseName: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "league")
    val league: League,
    @Json(name = "link")
    val link: String,
    @Json(name = "locationName")
    val locationName: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "season")
    val season: Int,
    @Json(name = "shortName")
    val shortName: String,
    @Json(name = "sport")
    val sport: Sport,
    @Json(name = "springLeague")
    val springLeague: SpringLeague,
    @Json(name = "springVenue")
    val springVenue: SpringVenue,
    @Json(name = "teamCode")
    val teamCode: String,
    @Json(name = "teamName")
    val teamName: String,
    @Json(name = "venue")
    val venue: Venue
)