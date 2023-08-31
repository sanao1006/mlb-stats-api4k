package response.jobs.datacasters


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JobsDatacastersResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "roster")
    val roster: List<Roster>
)