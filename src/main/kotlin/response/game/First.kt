package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class First(
    @Json(name = "fullName")
    val fullName: String, // Hunter Morris
    @Json(name = "id")
    val id: Int, // 519051
    @Json(name = "link")
    val link: String // /api/v1/people/519051
)