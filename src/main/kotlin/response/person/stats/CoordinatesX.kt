package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoordinatesX(
    @Json(name = "x")
    val x: Double, // 67.81
    @Json(name = "y")
    val y: Double // 126.06
)