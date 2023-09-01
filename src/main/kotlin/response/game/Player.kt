package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Player(
    @Json(name = "id")
    val id: Int, // 460699
    @Json(name = "link")
    val link: String // /api/v1/people/460699
)