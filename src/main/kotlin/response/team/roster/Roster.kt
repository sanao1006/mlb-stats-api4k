package response.team.roster


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Roster(
    @Json(name = "jerseyNumber")
    val jerseyNumber: String, // 28
    @Json(name = "parentTeamId")
    val parentTeamId: Int, // 108
    @Json(name = "person")
    val person: Person,
    @Json(name = "position")
    val position: Position,
    @Json(name = "status")
    val status: Status
)