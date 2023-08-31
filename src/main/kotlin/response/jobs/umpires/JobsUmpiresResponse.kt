package response.jobs.umpires


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JobsUmpiresResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "roster")
    val roster: List<Roster>
)