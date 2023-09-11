package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sport(
    @Json(name = "id")
    val id: Int?, // 1
    @Json(name = "link")
    val link: String? // /api/v1/sports/1
)