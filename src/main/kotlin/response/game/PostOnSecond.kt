package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostOnSecond(
    @Json(name = "fullName")
    val fullName: String, // Billy Hamilton
    @Json(name = "id")
    val id: Int, // 571740
    @Json(name = "link")
    val link: String // /api/v1/people/571740
)