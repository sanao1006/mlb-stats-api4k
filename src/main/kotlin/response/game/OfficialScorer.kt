package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OfficialScorer(
    @Json(name = "fullName")
    val fullName: String, // Brenton Goebel
    @Json(name = "id")
    val id: Int, // 618779
    @Json(name = "link")
    val link: String // /api/v1/people/618779
)