package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Save(
    @Json(name = "fullName")
    val fullName: String, // Brandon Kintzler
    @Json(name = "id")
    val id: Int, // 445213
    @Json(name = "link")
    val link: String // /api/v1/people/445213
)