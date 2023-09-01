package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Runner(
    @Json(name = "fullName")
    val fullName: String?, // Josh Prince
    @Json(name = "id")
    val id: Int?, // 572389
    @Json(name = "link")
    val link: String?,
    @Json(name = "credits")
    val credits: List<Credit>?,
    @Json(name = "details")
    val details: Details?,
    @Json(name = "movement")
    val movement: Movement?
)