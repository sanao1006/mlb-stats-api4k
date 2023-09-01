package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OnDeck(
    @Json(name = "fullName")
    val fullName: String, // Khris Davis
    @Json(name = "id")
    val id: Int, // 501981
    @Json(name = "link")
    val link: String // /api/v1/people/501981
)