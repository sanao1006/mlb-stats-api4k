package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weather(
    @Json(name = "condition")
    val condition: String, // Partly Cloudy
    @Json(name = "temp")
    val temp: String, // 85
    @Json(name = "wind")
    val wind: String // 13 mph, R To L
)