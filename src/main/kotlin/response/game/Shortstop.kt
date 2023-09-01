package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Shortstop(
    @Json(name = "fullName")
    val fullName: String, // Tommy Manzella
    @Json(name = "id")
    val id: Int, // 446373
    @Json(name = "link")
    val link: String // /api/v1/people/446373
)