package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PitchData(
    @Json(name = "breaks")
    val breaks: Breaks?,
    @Json(name = "coordinates")
    val coordinates: Coordinates,
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double, // 1.535
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double // 3.371
)