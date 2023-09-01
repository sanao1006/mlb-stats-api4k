package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coordinates(
    @Json(name = "coordX")
    val coordX: Double, // 163.65
    @Json(name = "coordY")
    val coordY: Double // 163.65
)