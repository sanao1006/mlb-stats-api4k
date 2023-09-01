package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movement(
    @Json(name = "end")
    val end: String?, // 1B
    @Json(name = "isOut")
    val isOut: Boolean, // true
    @Json(name = "originBase")
    val originBase: String?, // 1B
    @Json(name = "outBase")
    val outBase: String?, // 1B
    @Json(name = "outNumber")
    val outNumber: Int?, // 1
    @Json(name = "start")
    val start: String? // 1B
)