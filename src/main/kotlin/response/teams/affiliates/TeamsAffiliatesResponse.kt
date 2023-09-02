package response.teams.affiliates


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamsAffiliatesResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "teams")
    val teams: List<Team>
)