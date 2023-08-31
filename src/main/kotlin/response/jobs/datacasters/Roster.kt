package response.jobs.datacasters


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Roster(
    @Json(name = "jerseyNumber")
    val jerseyNumber: String,
    @Json(name = "job")
    val job: String,
    @Json(name = "jobId")
    val jobId: String,
    @Json(name = "person")
    val person: Person,
    @Json(name = "title")
    val title: String
)