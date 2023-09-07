package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PitchData(
    @Json(name = "breaks")
    val breaks: Breaks?,
    @Json(name = "coordinates")
    val coordinates: CoordinatesX,
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double, // 1.601
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double // 3.49
)