package response.team.coaches


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Roster(
    @Json(name = "jerseyNumber")
    val jerseyNumber: String, // 88
    @Json(name = "job")
    val job: String, // Manager
    @Json(name = "jobId")
    val jobId: String, // MNGR
    @Json(name = "person")
    val person: Person,
    @Json(name = "title")
    val title: String // Manager
)