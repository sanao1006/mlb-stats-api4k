package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Home(
    @Json(name = "fullName")
    val fullName: String, // Daniel Corcino
    @Json(name = "id")
    val id: Int, // 542289
    @Json(name = "link")
    val link: String // /api/v1/people/542289
)