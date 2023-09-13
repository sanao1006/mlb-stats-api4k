package response.people.changes


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PrimaryPosition(
    @Json(name = "abbreviation")
    val abbreviation: String, // SS
    @Json(name = "code")
    val code: String, // 6
    @Json(name = "name")
    val name: String, // Shortstop
    @Json(name = "type")
    val type: String // Infielder
)