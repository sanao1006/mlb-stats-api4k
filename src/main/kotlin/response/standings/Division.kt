package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Division(
    @Json(name = "id")
    val id: Int?, // 204
    @Json(name = "link")
    val link: String?, // /api/v1/divisions/204
    @Json(name = "name")
    val name: String? // National League West
)