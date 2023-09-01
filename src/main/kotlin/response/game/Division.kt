package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Division(
    @Json(name = "id")
    val id: Int, // 239
    @Json(name = "link")
    val link: String, // /api/v1/divisions/239
    @Json(name = "name")
    val name: String // Southern League North
)