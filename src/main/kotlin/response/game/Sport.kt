package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sport(
    @Json(name = "id")
    val id: Int, // 12
    @Json(name = "link")
    val link: String, // /api/v1/sports/12
    @Json(name = "name")
    val name: String // Double-A
)