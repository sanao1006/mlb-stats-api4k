package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HitData(
    @Json(name = "coordinates")
    val coordinates: Coordinates,
    @Json(name = "hardness")
    val hardness: String, // medium
    @Json(name = "location")
    val location: String, // 3
    @Json(name = "trajectory")
    val trajectory: String // ground_ball
)