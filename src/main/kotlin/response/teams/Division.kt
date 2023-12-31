package response.teams


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Division(
    @Json(name = "abbreviation")
    val abbreviation: String?,
    @Json(name = "active")
    val active: Boolean?,
    @Json(name = "hasWildcard")
    val hasWildcard: Boolean?,
    @Json(name = "id")
    val id: Int,
    @Json(name = "league")
    val league: League?,
    @Json(name = "link")
    val link: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "nameShort")
    val nameShort: String?,
    @Json(name = "numPlayoffTeams")
    val numPlayoffTeams: Int?,
    @Json(name = "season")
    val season: String?,
    @Json(name = "sortOrder")
    val sortOrder: Int?,
    @Json(name = "sport")
    val sport: Sport?
)