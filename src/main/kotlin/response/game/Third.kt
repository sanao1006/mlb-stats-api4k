package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Third(
    @Json(name = "fullName")
    val fullName: String, // Hainley Statia
    @Json(name = "id")
    val id: Int, // 461871
    @Json(name = "link")
    val link: String // /api/v1/people/461871
)