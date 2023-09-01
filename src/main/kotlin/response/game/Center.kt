package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Center(
    @Json(name = "fullName")
    val fullName: String, // Josh Prince
    @Json(name = "id")
    val id: Int, // 572389
    @Json(name = "link")
    val link: String // /api/v1/people/572389
)