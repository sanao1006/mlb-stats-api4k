package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllPosition(
    @Json(name = "abbreviation")
    val abbreviation: String, // P
    @Json(name = "code")
    val code: String, // 1
    @Json(name = "name")
    val name: String, // Pitcher
    @Json(name = "type")
    val type: String // Pitcher
)