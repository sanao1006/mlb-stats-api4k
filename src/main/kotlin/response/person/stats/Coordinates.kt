package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coordinates(
    @Json(name = "coordX")
    val coordX: Double, // 143.57
    @Json(name = "coordY")
    val coordY: Double // 182.73
)