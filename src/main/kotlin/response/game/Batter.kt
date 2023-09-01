package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Batter(
    @Json(name = "fullName")
    val fullName: String, // Scooter Gennett
    @Json(name = "id")
    val id: Int, // 571697
    @Json(name = "link")
    val link: String // /api/v1/people/571697
)