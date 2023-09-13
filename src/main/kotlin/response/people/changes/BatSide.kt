package response.people.changes


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatSide(
    @Json(name = "code")
    val code: String, // R
    @Json(name = "description")
    val description: String // Right
)