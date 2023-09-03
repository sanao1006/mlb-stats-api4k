package response.teams.alumni


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PrimaryPosition(
    @Json(name = "abbreviation")
    val abbreviation: String, // RF
    @Json(name = "code")
    val code: String, // 9
    @Json(name = "name")
    val name: String, // Outfielder
    @Json(name = "type")
    val type: String // Outfielder
)