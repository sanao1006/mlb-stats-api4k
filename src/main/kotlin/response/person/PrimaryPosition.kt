package response.person


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PrimaryPosition(
    @Json(name = "abbreviation")
    val abbreviation: String, // TWP
    @Json(name = "code")
    val code: String, // Y
    @Json(name = "name")
    val name: String, // Two-Way Player
    @Json(name = "type")
    val type: String // Two-Way Player
)