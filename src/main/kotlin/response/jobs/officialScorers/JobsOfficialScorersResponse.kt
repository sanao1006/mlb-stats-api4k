package response.jobs.officialScorers


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JobsOfficialScorersResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "roster")
    val roster: List<Roster>
)