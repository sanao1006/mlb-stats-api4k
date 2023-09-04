package response.team.roster


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Status(
    @Json(name = "code")
    val code: String, // A
    @Json(name = "description")
    val description: String // Active
)