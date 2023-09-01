package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlaysByInning(
    @Json(name = "bottom")
    val bottom: List<Int>,
    @Json(name = "endIndex")
    val endIndex: Int, // 7
    @Json(name = "hits")
    val hits: Hits,
    @Json(name = "startIndex")
    val startIndex: Int, // 0
    @Json(name = "top")
    val top: List<Int>
)