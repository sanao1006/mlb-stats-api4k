package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Loser(
    @Json(name = "fullName")
    val fullName: String, // Wilkin De La Rosa
    @Json(name = "id")
    val id: Int, // 460344
    @Json(name = "link")
    val link: String // /api/v1/people/460344
)