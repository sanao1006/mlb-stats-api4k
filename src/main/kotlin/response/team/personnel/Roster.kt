package response.team.personnel


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Roster(
    @Json(name = "jerseyNumber")
    val jerseyNumber: String?, // 92
    @Json(name = "job")
    val job: String?, // Interpreter
    @Json(name = "jobId")
    val jobId: String?, // INTE
    @Json(name = "person")
    val person: Person?,
    @Json(name = "title")
    val title: String? // Major League Interpreter
)