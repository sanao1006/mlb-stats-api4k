package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Catcher(
    @Json(name = "fullName")
    val fullName: String, // Adam Weisenburger
    @Json(name = "id")
    val id: Int, // 605523
    @Json(name = "link")
    val link: String // /api/v1/people/605523
)